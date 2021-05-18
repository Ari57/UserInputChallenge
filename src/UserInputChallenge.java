import java.util.Scanner;
public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;


        while (count < 10) {
            int order = count + 1;
            System.out.println("Enter number #" + order);
            boolean hasNextInt = scanner.hasNextInt(); // checks to see if input is an int

            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                if (count == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine(); // avoids unforeseen input with enter key

        }
        System.out.println("The sum is " + sum);

        scanner.close();
    }
}
