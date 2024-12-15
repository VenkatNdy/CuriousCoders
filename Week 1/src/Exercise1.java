import  java.util.Scanner;
public class Exercise1 {

    private static void PrintValues() {
        System.out.println("Enter the Input : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String lit = scan.next();
        char ch = scan.next().charAt(0);
        System.out.println(num);
        System.out.println(lit);
        System.out.println(ch);
    }

    private static void IsTriangle() {
        System.out.println("Enter the 3 Angles: ");
        Scanner scan = new Scanner(System.in);
        int Angle1 = scan.nextInt();
        int Angle2 = scan.nextInt();
        int Angle3 = scan.nextInt();
        int sumOfAngles = Angle1 + Angle2 + Angle3;
        if(sumOfAngles == 180) {
           System.out.println("Triangle can be formed");
        } else {
            System.out.println("Triangle cannot be formed");
        }
    }

    private static void ShowGrade() {
        System.out.println("Enter the marks: ");
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        if (marks >= 90) {
           System.out.println("Grade A"); 
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if(marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    private static void DisplaySize() {
        System.out.println("Enter the Value: ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        switch (value){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid Size");
        }
    }

    public static void main(String[] args){
        Exercise1.PrintValues();
        Exercise1.IsTriangle();
        Exercise1.ShowGrade();
        Exercise1.DisplaySize();
    }

}
