import java.util.Scanner;

public class RangeSum {  //Task# 1

    public static int sum(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number + sum(number - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range's ending number ");
        int number = scanner.nextInt();
        System.out.println(sum(number));
    }

}
