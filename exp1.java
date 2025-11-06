public class exp1 {
    public static void main(String[] args) {
        // Declare variables for demonstration
        int a = 10, b = 5, c = 3;
        boolean x = true, y = false;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        System.out.println("\n=== Logical Operators ===");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        System.out.println("\n=== Assignment Operators ===");
        int d = a; // Simple assignment
        System.out.println("d = a; d = " + d);
        d += b; // Add and assign
        System.out.println("d += b; d = " + d);
        d -= c; // Subtract and assign
        System.out.println("d -= c; d = " + d);
        d *= 2; // Multiply and assign
        System.out.println("d *= 2; d = " + d);
        d /= 4; // Divide and assign
        System.out.println("d /= 4; d = " + d);
        d %= 3; // Modulus and assign
        System.out.println("d %= 3; d = " + d);

        System.out.println("\n=== Operator Precedence ===");
        // Precedence: * / % have higher precedence than + -
        int result1 = a + b * c; // b * c first, then + a
        System.out.println("a + b * c = " + a + " + " + b + " * " + c + " = " + result1);

        // Using parentheses to override precedence
        int result2 = (a + b) * c; // a + b first, then * c
        System.out.println("(a + b) * c = (" + a + " + " + b + ") * " + c + " = " + result2);

        System.out.println("\n=== Operator Associativity ===");
        // Associativity: Left to right for + and -
        int result3 = a - b - c; // (a - b) - c
        System.out.println("a - b - c = " + a + " - " + b + " - " + c + " = " + result3);

        // Right to left for assignment
        int e, f, g;
        e = f = g = 10; // g = 10, then f = g, then e = f
        System.out.println("e = f = g = 10; e = " + e + ", f = " + f + ", g = " + g);
    }
}
