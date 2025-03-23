public class a {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 and 100:");
        // Loop through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
