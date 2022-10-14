import java.util.Scanner;

public class sipreturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter monthly SIP");
        double monthlySIP = sc.nextDouble();
        System.out.println("Enter return %");
        double rate = sc.nextDouble();
        System.out.println("Enter time period");
        double years = sc.nextDouble();
        double total = 0;
        double yearendamount = 12*monthlySIP;
        for(int i=1;i<=years;i++){
            total += yearendamount + (rate/100) * yearendamount;
            System.out.println("End of year "+i+" =>"+total);
        }
        System.out.println("Your total value will be: "+total);
    }
}
