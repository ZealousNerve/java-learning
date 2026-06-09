"""
snapshot.py — Java repo snapshot generator
Place this file in the ROOT of your Java learning repo.
Run from IntelliJ terminal: python snapshot.py
Output: snapshot.txt (created in the same folder)
"""

import os
from datetime import datetime

# ── Config ──────────────────────────────────────────────
OUTPUT_FILE = "snapshot.txt"
INCLUDE_EXTENSIONS = {".java", ".md"}
SKIP_DIRS = {".git", ".idea", "out", "build", "target", "__pycache__", ".gradle"}
# ────────────────────────────────────────────────────────


def build_tree(root_path, prefix=""):
    """Recursively build a visual folder/file tree string."""
    lines = []
    try:
        entries = sorted(os.listdir(root_path))
    except PermissionError:
        return lines

    # Filter out skipped dirs and the output file itself
    entries = [
        e for e in entries
        if e not in SKIP_DIRS and e != OUTPUT_FILE and not e.startswith(".")
    ]

    for i, entry in enumerate(entries):
        full_path = os.path.join(root_path, entry)
        connector = "└── " if i == len(entries) - 1 else "├── "
        lines.append(f"{prefix}{connector}{entry}")
        if os.path.isdir(full_path):
            extension = "    " if i == len(entries) - 1 else "│   "
            lines.extend(build_tree(full_path, prefix + extension))

    return lines


def collect_files(root_path, extension):
    """Walk repo and collect all files with a given extension."""
    matches = []
    for dirpath, dirnames, filenames in os.walk(root_path):
        # Skip unwanted directories in-place so os.walk won't descend into them
        dirnames[:] = sorted(
            d for d in dirnames
            if d not in SKIP_DIRS and not d.startswith(".")
        )
        for fname in sorted(filenames):
            if fname.endswith(extension):
                full = os.path.join(dirpath, fname)
                rel = os.path.relpath(full, root_path)
                matches.append((rel, full))
    return matches


def read_file(path):
    """Read a file safely, returning its content or an error note."""
    try:
        with open(path, "r", encoding="utf-8", errors="replace") as f:
            return f.read()
    except Exception as e:
        return f"[Could not read file: {e}]"


def divider(char="═", width=60):
    return char * width


def section_header(title):
    pad = (60 - len(title) - 2) // 2
    return f"\n{'─' * pad} {title} {'─' * pad}\n"


def main():
    root = os.path.dirname(os.path.abspath(__file__))
    repo_name = os.path.basename(root)
    timestamp = datetime.now().strftime("%Y-%m-%d %H:%M:%S")

    lines = []

    # ── Header ──
    lines.append(divider("═"))
    lines.append(f"  REPO SNAPSHOT")
    lines.append(f"  Generated : {timestamp}")
    lines.append(f"  Root      : {repo_name}/")
    lines.append(divider("═"))

    # ── Folder Tree ──
    lines.append(section_header("FOLDER TREE"))
    lines.append(f"{repo_name}/")
    lines.extend(build_tree(root))

    # ── Java Files ──
    java_files = collect_files(root, ".java")
    lines.append(section_header(f"JAVA FILES ({len(java_files)} found)"))

    if java_files:
        for rel_path, full_path in java_files:
            lines.append(f"\n▶  {rel_path}")
            lines.append(divider("─", 50))
            lines.append(read_file(full_path))
            lines.append(divider("─", 50))
    else:
        lines.append("  No .java files found.")

    # ── Markdown Files ──
    md_files = collect_files(root, ".md")
    lines.append(section_header(f"MARKDOWN FILES ({len(md_files)} found)"))

    if md_files:
        for rel_path, full_path in md_files:
            lines.append(f"\n▶  {rel_path}")
            lines.append(divider("─", 50))
            lines.append(read_file(full_path))
            lines.append(divider("─", 50))
    else:
        lines.append("  No .md files found.")

    # ── Footer ──
    lines.append(f"\n{divider('═')}")
    lines.append(f"  END OF SNAPSHOT  ·  {len(java_files)} java  ·  {len(md_files)} markdown")
    lines.append(divider("═"))

    # ── Write output ──
    output_path = os.path.join(root, OUTPUT_FILE)
    with open(output_path, "w", encoding="utf-8") as out:
        out.write("\n".join(lines))

    print(f"✅  Snapshot saved → {output_path}")
    print(f"    {len(java_files)} .java files  |  {len(md_files)} .md files")


if __name__ == "__main__":
    main()
