public class level3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        int count = 0;
        int value = Math.abs(number);
        if (value == 0) {
            count = 1;
        }
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
