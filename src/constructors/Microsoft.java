package constructors;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {


        Employee employeeOne = new Employee();// calling for default constructor
        employeeOne.salary=2000;
        System.out.println(employeeOne.toString());//you can delete toString() because that is work automatically
        //Employee{name='null', jobTitle='null', ID=0, salary=$10000.0, companyNameMicrosoft}
                                                        //salary=$120000.0
        employeeOne.salary=120000;
        employeeOne.name="Ersin";
        employeeOne.ID=100;
        employeeOne.jobTitle="Technical Manager";

        System.out.println(employeeOne);

        Employee employeeTwo=new Employee("Efe","QA Lead",200,110000);

        System.out.println(employeeTwo);


        ArrayList<Employee>team =new ArrayList<>();
        team.add(employeeOne);
        team.add(employeeTwo);

        team.add(new Employee("Jamal","SDET",300,95000));

        //let's find Max salary from team list
            double maxSalary=Double.MIN_VALUE;
            for(Employee each :team){//each is an Employee object
                if(each.salary>maxSalary){
                    maxSalary=each.salary;
                }
            }

        System.out.println("maxSalary = " + maxSalary);

            //I want to find Jamal's job title
        for (Employee each:team){
            if(each.name.equalsIgnoreCase("jamal")){
                System.out.println(each.jobTitle);
            }
        }

       // employeeOne.companyName="Tesla"; // when we change for one it same will change for every object. because that companyName is static
/*
note: you can change or call static field through object or classname, but second one maybe preferable
 */
        //company name for each employee
        for (Employee each: team){
            System.out.println(each.name+" is working for "+each.companyName);
        }

    }
}
