import java.util.Scanner;

public class Try_catch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("entetr first the nulmber");

            int num1 = input.nextInt();
            System.out.print("enter the second number");
            int num2 = input.nextInt();

            int c = num1 / num2;
            System.out.print("result:" + c);
        } catch (ArithmeticException e) {

            System.out.print("divident canot be a use o give valid number error is " + e);

        }

    }

}
