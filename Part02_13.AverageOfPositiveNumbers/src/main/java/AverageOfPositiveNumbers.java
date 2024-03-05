
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumPositives = 0;
        int countPositives = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                sumPositives += number;
                countPositives += 1;
            }
        }

        if (sumPositives == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sumPositives/countPositives);
        }
    }
}
