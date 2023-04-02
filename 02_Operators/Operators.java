public class Operators {
    public static void main(String[] args) {
        // binary arithmetic operators
        System.out.println("binary arithmetic operators");

        int a = 10;
        int b = 3;
        System.out.println("a = " + a + "; b = " + b);

        // addition
        int c = a + b;
        System.out.println("a + b = " + c);

        // modulo
        int d = a % b;
        System.out.println("a % b = " + d + "\n");



        // unary arithmetic operators (prefix and postfix notation
        System.out.println("unary arithmetic operators (prefix and postfix notation");

        int e = 5;
        int f = 3;
        e++; // increases the value of e by 1
        f--; // decreases the value of f by 1
        System.out.println("e = " + e + "; f = " + f + "\n");

        int x = 5;
        int y = ++x; // x is increased by 1 before y is assigned, so y will have the value 6
        System.out.println("x = " + x + "; y = " + y);
        int z = x--; // x is decreased by 1 after z is assigned, so z will have the value 6 and x the value 5
        System.out.println("x = " + x + "; z = " + z);
    }
}
