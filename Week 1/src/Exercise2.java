import java.util.Scanner;

public class Exercise2 {

    private static void PrintNumYTimes() {
        System.out.println("Enter Number for X: ");
        Scanner scan1 = new Scanner(System.in);
        int x = scan1.nextInt();
        System.out.println("Enter Number for Y: ");
        Scanner scan2 = new Scanner(System.in);
        int y = scan2.nextInt();
        for(int i = 0; i < y; i++) {
            System.out.println(x);
        }
    }

    private static void PrintMultiples() {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i * num <= 1000; i++) {
            System.out.println(i * num);
        }
    }

    private static void PrintNameNTimes() {
        System.out.println("Enter First Name: ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        System.out.println("Enter Last Name: ");
        String lastName = scan.next();
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            System.out.println(firstName + lastName);
        }
    }

    private static void PrintNumNTimes() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = num; i > 0; i--) {
            for(int j = num; j > 0; j--) {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args){
//        Exercise2.PrintNumYTimes();
//        Exercise2.PrintMultiples();
//        Exercise2.PrintNameNTimes();
        Exercise2.PrintNumNTimes();
    }
}
