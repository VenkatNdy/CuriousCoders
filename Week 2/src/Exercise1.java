import java.util.Scanner;

public class Exercise1 {

    private static void Pattern1() {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    private static void Pattern2() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                if(j % 2 == 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void Pattern3() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }

    private static void Pattern4() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void Pattern5() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void Pattern6() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = num; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Pattern7() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Pattern8() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = num-1; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Pattern9() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Pattern10() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= (2 * num) - (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Pattern11() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i = 1; i <= num - 1; i++) {
            for(int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= (2 * num) - (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void Pattern12() {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int counter = 1;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
                counter++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Exercise1.Pattern12();
    }
}