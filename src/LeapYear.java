import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the Year");
//        int userYear=Integer.parseInt(scanner.nextLine());
        for(int year=2019;year<=2039;year++)
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println( year + " is a Leap year");
        }
        else if(year%4!=0){
            System.out.println(year + " is not a Leap year");
        }

    }
}
