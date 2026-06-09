# AGENTS.md - Guidance for AI Coding Agents

This is a **learning-focused Java repository** organized as a structured progression of Core Java concepts. The project is not a production system but an educational resource for understanding Java fundamentals through concept-grouped code examples with inline comments.

## Project Structure & Architecture

**Progression-Based Organization**: Folders are numbered `01_*` through `19_*` representing a learning path:
- `01-07`: Java fundamentals (basics, operators, control flow, methods, OOP basics)
- `08-14`: Advanced OOP (inheritance, interfaces, inner classes, enums, annotations)
- `15-19`: Advanced features (exception handling, I/O, threads, collections, streams)

**Key Structural Pattern**:
- Each folder contains standalone, runnable examples for a single concept
- Files are named after the concept they demonstrate (e.g., `Encapsulation.java`, `ThreadsInJava.java`)
- Examples are **self-contained** - each has a `main()` method and runs independently
- No external dependencies or build system - files compile and run directly with `javac`/`java`

## Codebase Patterns & Conventions

### Commenting Style
- Heavy **inline documentation** explaining concepts side-by-side with code
- Comments include "why" not just "what" - teaching reasoning is central
- Example: `Encapsulation.java` explains the `this` keyword's purpose in detail

### Package Usage
- Most files are in default package (no package declaration)
- Dedicated package examples in `12_PackageInJava/PackgJava/` demonstrating multi-file package structures
- Package examples are replicas of parent concepts (e.g., `Calc.java` and `AdvCalc.java` exist in both standard and package versions)

### Inheritance & Polymorphism
- `08_CoreOOPs/Inheritance/` contains multi-level inheritance examples
- Files follow parent→child hierarchy: `Calc.java` → `AdvCalc.java` → `VeryAdvCalc.java`
- Classes intentionally left non-final for inheritance demonstration

### Functional Programming (Java 8+)
- `@FunctionalInterface` annotation marks interfaces with single abstract methods
- Lambda expressions shown alongside traditional anonymous class syntax with comments showing both forms
- Stream API examples in `19_StreamAPI/` demonstrate functional transformations

### Exception Handling
- Three-tier structure: `ExceptionHierarchy.java` (framework), `CustomException.java` (creation), `ExceptionHandling.java` (usage)
- `TryWithResources.java` demonstrates modern try-with-resources syntax
- `ThrowsKeyword.java` shows exception delegation patterns

### Multithreading
- `Thread` extension pattern shown in `ThreadsInJava.java`
- `Runnable` alternative in `RunnableVsThreads.java`
- Thread states and race conditions in separate focused files
- `Thread.sleep()` used heavily with try-catch handling for `InterruptedException`

## Build & Execution

**Minimal Build Process**:
- No Maven/Gradle configuration - pure Java source files
- IDE: IntelliJ IDEA (project file: `IdeaProjects.iml`)
- Each file compiles independently: `javac FileName.java`
- Execution: `java ClassName` (requires class with `public static void main()`)

**Special Notes**:
- Classes with `main()` are executable entry points; support classes in same folder are helpers
- Test-like files (e.g., comparison tests in `ComparatorVsComparable.java`) demonstrate functionality via printed output
- Problem-solving notes in `cp_notes/HackerRank.java` contain competitive programming concepts mixed with pure Java

## Key Learning Boundaries

### Cross-Folder Dependencies
- Earlier concepts are prerequisites for later ones (e.g., understand `Encapsulation` before `Inheritance`)
- Inner classes (`10_*`) depend on understanding basic OOP (`08_*`)
- Stream API (`19_*`) assumes understanding of `Collections` (`18_*`) and `Interfaces` (`13_*`)

### Important Shared Concepts
- **`this` keyword**: Introduced in `Encapsulation.java`, referenced throughout OOP sections
- **Method Overloading vs Overriding**: `05_Methods/MethodOverloadingInJava.java` vs `08_CoreOOPs/MethodOverriding.java`
- **Boxing/Unboxing**: `09_TypeSystem/WrapperClass.java` underpins collection generics

### Collections Framework Hierarchy
- `ArrayListInJava.java` → `SetInJava.java` → `MapInJava.java` (interface relationships)
- `ComparatorVsComparable.java` contrasts two sorting strategies
- Understanding `CollectionInJava.java` is foundational for later examples

## Common AI Agent Tasks

**When Adding Examples**:
- Follow naming: `{ConceptName}.java` with executable `main()`
- Add inline comments explaining the "why" alongside code
- Preserve package examples as duplicates when introducing packages
- Keep examples focused on one concept per file

**When Explaining Code**:
- Reference the folder structure to show learning progression
- Cite inline comments as primary documentation source
- Note that examples are intentionally simple and runnable, not production-quality

**When Suggesting Improvements**:
- Avoid adding external libraries or build tools - keep project structure unchanged
- Focus on clarity and teaching value, not performance optimization
- Ensure all suggested code includes a `main()` method for independent execution

## External Resources in Codebase

- `cp_notes/Extras.txt`: Supplementary learning notes
- `cp_notes/HackerRank.java`: Competitive programming problem solutions
- These demonstrate applying Java concepts to algorithm problems

---

**Last Updated**: March 2026  
**Target Audience**: Java learners (beginner to intermediate level)  
**Learning Approach**: Concept-driven with heavy inline documentation and runnable examples

