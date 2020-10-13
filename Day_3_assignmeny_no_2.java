import java.util.Scanner;

class Day_3_assignmeny_no_2
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Employee Information ");
        System.out.print("Enter Name: ");
        String Name=s.next();
        System.out.print("Enter Date of Birth :");
        int dob=s.nextInt();
        System.out.print("Enter Month of  Birth :");
        int mob=s.nextInt();
        System.out.print("Enter Year of  Birth :");
        int yob=s.nextInt();
        System.out.print("Enter Monthly Salary :");
        float monthly_salary=s.nextFloat();
        double annualsalary=monthly_salary*12.0;
        double tax=0.0;
        if(annualsalary>=500000)
        {
            tax=0.2*500000;
        }
        else if(annualsalary>=400000)
        {
            tax=0.15*400000;
        }
        else if(annualsalary>=300000)
        {
            tax=0.1*300000;
        }
        else if(annualsalary>=200000)
        {
            tax=0.05*200000;
        }
        else 
        {
            System.out.println("Congratulation You Don't have to pay\n Because Your Annual Salary is : ");
        }

        System.out.println("Name :"+Name);
        int age=2020-yob;
        System.out.println("Age :"+age);
        System.out.println("Your Annual Salary :"+annualsalary);
        System.out.println("Tax :"+tax);



    }
}