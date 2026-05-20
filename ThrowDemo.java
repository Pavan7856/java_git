import java.util.Scanner;

public class ThrowDemo {
    void m1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no1");
        int no1 = sc.nextInt();

        System.out.println("Enter no2");
        int no2 = sc.nextInt();

        try {
            int res = no1 / no2;
            System.out.println("Result : " + res);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowDemo td = new ThrowDemo();
        td.m1();
    }

}
