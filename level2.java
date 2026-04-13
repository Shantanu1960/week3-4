public class level2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a natural number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Number should be a natural number");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                } else {
                    System.out.println(i + " is odd number");
                }
            }
        }
        System.out.print("Enter salary: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        int years = scanner.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("Bonus amount: 0.0");
        }
        System.out.print("Enter a number for multiplication table: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        int tableNumber = scanner.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
        }
        System.out.print("Enter a positive integer for FizzBuzz: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        int fizzLimit = scanner.nextInt();
        if (fizzLimit > 0) {
            int i = 1;
            while (i <= fizzLimit) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Positive integer required");
        }
        scanner.close();
    }
}
