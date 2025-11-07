public class Exp1 {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        int num = 10;
        System.out.println("\nAssignment Operators:");
        num += 5;
        System.out.println("num += 5: " + num);
        num -= 3;
        System.out.println("num -= 3: " + num);
        num *= 2;
        System.out.println("num *= 2: " + num);
        num /= 4;
        System.out.println("num /= 4: " + num);
        num %= 3;
        System.out.println("num %= 3: " + num);

        System.out.println("\nOperator Precedence and Associativity:");
        int result1 = a + b * c;
        int result2 = (a + b) * c;
        int result3 = a++ + --b * c;
        System.out.println("a + b * c = " + result1);
        System.out.println("(a + b) * c = " + result2);
        System.out.println("a++ + --b * c = " + result3);
        System.out.println("a = " + a + ", b = " + b);
    }
}
