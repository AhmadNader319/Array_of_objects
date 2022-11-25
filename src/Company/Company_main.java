package Company;

import java.util.*;
public class Company_main {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int noMan = input.nextInt();//number of managers

        Manager[] managers = new Manager[noMan];//define array of objects
        //pass elements in array of objects
        for (int i = 1 ; i<=noMan;i++){
            System.out.println("enter manager["+i+"] id = ");
            int id = input.nextInt();
            System.out.println("enter manager["+i+"] Name = ");
            String name = input.next();
            managers[i-1] = new Manager(id,name);
        }
        System.out.println("----------------------Managers_info---------------------");
        System.out.println();
        for (int i = 1 ; i<= noMan;i++){
            System.out.println("Company.Manager " +i+ " info is » ");managers[i-1].getMInfo();
        }
        System.out.println("----------------------manager 1 info---------------------");
        managers[0].getSingleInfo();

        //employee info
        Employee[] employees = { new Employee("Ahmad", 11), new Employee("Nader", 22), new Employee("Abd El-Moneim", 33), new Employee("Sayed", 44) };
        System.out.println("----------------------employees_info---------------------");
        for (int i = 1 ; i<= employees.length;i++){
            System.out.println("employee " +i+ " info is » ");employees[i-1].getEInfo();
        }


    }
}