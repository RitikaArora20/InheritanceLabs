import java.util.Scanner;


public class WithInheritance {
    public static void main(String[] args)
    {
        double finalSalary,hra,bonus;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Bonus and HRA for IT dept");
        hra=scanner.nextDouble();
        bonus=scanner.nextDouble();
        ITDepartmentWithInheritance employeeOne=new ITDepartmentWithInheritance(15000,1500,hra,bonus);
        finalSalary=employeeOne.calculateSalary();
        System.out.println("The total salary of IT Department employees is"+finalSalary);

        System.out.println("Enter Bonus and HRA for HR dept");
        hra=scanner.nextDouble();
        bonus=scanner.nextDouble();
        HRDepartmentWithInheritance employeeTwo=new HRDepartmentWithInheritance(15000,1500,hra,bonus);
        finalSalary=employeeTwo.calculateSalary();
        System.out.println("The total salary of IT Department employees is"+finalSalary);

        System.out.println("Enter Bonus and HRA for Operations dept");
        hra=scanner.nextDouble();
        bonus=scanner.nextDouble();
        OpsDepartmentWithInheritance employeeThree=new OpsDepartmentWithInheritance(15000,1500,hra,bonus);
        finalSalary=employeeThree.calculateSalary();
        System.out.println("The total salary of IT Department employees is"+finalSalary);


    }
}
