import java.util.Scanner;
import java.lang.String;
class Aemployee
{
    int id;
    String name;
    int salary;
    String dep;
}
public class Employee
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        Scanner ob1 = new Scanner(System.in);
        System.out.print("Enter The Following: \n Id: \n Name: \n Salary: \n Department: \n");
        Aemployee a1 = new Aemployee();
        a1.id=ob.nextInt();
        a1.name=ob1.nextLine();
        a1.salary=ob.nextInt();
        a1.dep=ob1.nextLine();
        System.out.println("Employee Id:"+a1.id);
        System.out.println("Employee Name:"+a1.name);
        System.out.println("Employee Salary:"+a1.salary);
        System.out.println("Employee Department:"+a1.dep);
    }
}
