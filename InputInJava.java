import java.util.Scanner;

public class InputInJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();       // like scanf("%d", &a)
        float b = sc.nextFloat();   // like scanf("%f", &b)
       // String name = sc.next();    // like scanf("%s", name)

        System.out.printf("%d %.2f %s", a, b); // same printf style
    }
}