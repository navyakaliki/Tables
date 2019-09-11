import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        {
            System.out.println("Enter the number");
            int inputNum=Integer.parseInt(scanner.nextLine());
            for(int i=1;i<=inputNum;i++) {
                for(int j=1;j<=12;j++){
                    int sum=i*j;
                    System.out.println(i + "  " + "X" + " " + j +" " + "="+ sum);
                }
            }
        }
    }
}

