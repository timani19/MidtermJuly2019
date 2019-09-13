package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
	public static void main(String[] args) throws Exception {

		EmployeeInfo emp1 = new EmployeeInfo("Courtney Pulley", 787677);
		EmployeeInfo emp2= new EmployeeInfo("Elisha Karki", 787654);
		EmployeeInfo emp3 = new EmployeeInfo("Mahim Naveed", 786527);
		EmployeeInfo emp4=new EmployeeInfo("Tashfia Imani", 785637);



		emp1.setDepartmentName("IT");
		System.out.println("Department: " + "Courtney Pulley-------------"  + " "  + " " +emp1.getDepartmentName());
		emp2.setDepartmentName("Service");
		System.out.println("Department: " + "Elisha Karki-------------" +emp2.getDepartmentName());
		emp3.setDepartmentName("Finance");
		System.out.println("Department: " + "Mahim Naveed-------------" +emp3.getDepartmentName());
		emp4.setDepartmentName("Information Technology");
		System.out.println("Department: " + "Tashfia Imani-------------" +emp4.getDepartmentName());


		emp1.setSalary(6000);
		emp1.calculateSalary(emp1.getSalary());
		System.out.println("Courtney Pulley"  +" " + "Salary: " +emp1.getSalary());
		emp2.setSalary(6500);
		emp2.calculateSalary(emp2.getSalary());
		System.out.println("Elisha Karki"  +" " + "Salary: " +emp2.getSalary());
		emp3.setSalary(7000);
		emp3.calculateSalary(emp3.getSalary());
		System.out.println("Mahim Naveed" + " " + "Salary: " +emp3.getSalary());
		emp4.setSalary(7500);
		emp4.calculateSalary(emp4.getSalary());
		System.out.println("Tashfia Imani" + " " + "Salary: " + emp4.getSalary());


		emp1.benefitLayout();
		System.out.println("Courtney has unlimited Paid sick Leave");
		emp4.benefitLayout();
		System.out.println("Tashfia Have unlimited Paid sick Leave");
		System.out.println("Company Name: " + emp1.getCompanyName());


		emp1.setPerformance(4);
		double bonusemp1 = emp1.calculateEmployeeBonus(emp1.getSalary(), emp1.getPerformance());
		System.out.println("Courtney Pulley Bonus: " +bonusemp1);
		emp2.setPerformance(3);
		double bonusemp2 = emp2.calculateEmployeeBonus(emp2.getSalary(), emp2.getPerformance());
		System.out.println("Elisha Karki Bonus" + bonusemp2);
		emp3.setPerformance(4);
		double bonusemp3 = emp3.calculateEmployeeBonus(emp3.getSalary(), emp3.getPerformance());
		System.out.println("Mahim Naveed Bonus: " + bonusemp3);
		emp4.setPerformance(5);
		double bonusemp = emp4.calculateEmployeeBonus(emp4.getSalary(), emp4.getPerformance());
		System.out.println("Tashfia Imani Bonus: " + bonusemp);

		EmployeeInfo.calculateEmployeePension(emp4.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> emp1Record= new ArrayList<Object>();
		emp1Record.add(emp1.employeeName());
		emp1Record.add(emp1.calculateSalary(emp1.getSalary()));
		emp1Record.add(bonusemp1);

		List<Object> emp2Record = new ArrayList<Object>();
		emp2Record.add(emp2.employeeName());
		emp2Record.add(emp2.calculateSalary(emp2.getSalary()));
		emp2Record.add(bonusemp2);

	}

}