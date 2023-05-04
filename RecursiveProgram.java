public class RecursiveProgram {
    public static void main(String[] args) {
        RecursiveProgram recursiveProgram = new RecursiveProgram();
        int n = 5;
        int result = recursiveProgram.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}