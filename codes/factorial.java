public class Factorial {
    public static int fact(int n) {
        return (n < 0) ? -1 : (n <= 1) ? 1 : n * fact(n - 1);
    }

    public static void main(String[] args) {
        int result = fact(5);
        if (result == -1) {
            System.out.println("Can't get factorial of negative integer.");
        } else {
            System.out.println("Factorial of 5: " + result);
        }
    }
}
