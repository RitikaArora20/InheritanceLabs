import java.util.Scanner;

public class WithoutInheritance {
    public static void main(String[] args) {
        double basicSalary = 2000;
        double da = 1500;
        double totalSalary;
        double hra,bonus;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Bonus and HRA for IT dept");
        hra=scanner.nextDouble();
        bonus=scanner.nextDouble();
        ITDepartment employeeOfIt = new ITDepartment(basicSalary, da, hra,bonus);
        totalSalary=employeeOfIt.calculateSalary();
        System.out.println("total Salary of IT department employee is "+totalSalary);

        System.out.println("Enter Bonus and HRA for HR dept");
        hra=scanner.nextDouble();
        bonus=scanner.nextDouble();
        HRDepartment employeeOfHR = new HRDepartment(basicSalary, da, hra,bonus);
        totalSalary=employeeOfHR.calculateSalary();
        System.out.println("total Salary of IT department employee is "+totalSalary);

        System.out.println("Enter Bonus and HRA for Operations dept");
        hra=scanner.nextDouble();
        bonus=scanner.nextDouble();
        OperationsDepartment employeeOfOps = new OperationsDepartment(basicSalary, da, hra,bonus);
        totalSalary=employeeOfOps.calculateSalary();
        System.out.println("total Salary of IT department employee is "+totalSalary);



    }



}
