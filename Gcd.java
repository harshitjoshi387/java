
public class Gcd {

    public static int FindGcd(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {

        int num1 = 48;
        int num2 = 18;

        System.out.println("GCD: " + FindGcd(num1, num2));
    }
}
