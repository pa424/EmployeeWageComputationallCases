
public class Main {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullDay = 8;
        int halfDay = 4;
        System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
        System.out.println("");

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if( empCheck == 0 )
        {
            System.out.print("Employee is Present");
            System.out.println("");
            System.out.print("The daily wage of Employee is : " + ( wagePerHour * fullDay ));
            System.out.println("");
        }

        else if ( empCheck == 1 )

        {
            System.out.print("Employee is Present but working part time ");
            System.out.println("");
            System.out.print("The daily wage of Employee is : " + ( wagePerHour * halfDay ));
            System.out.println("");
        }
        else
        {
            System.out.print("Employee is Absent");
            System.out.println("");
            System.out.println("The daily wage of Employee is : 0 " );
            System.out.println("");
        }

    }
}