package design;

import java.util.Scanner;

public class EmployeeInfo extends CompanyStructure {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */
	final static String employerName = "Conduent";
	private int employeeId;
	private String name;
	private String departmentName;
	private int performance;
	static double salary;

	// Default constructor

	public EmployeeInfo() {}

	public EmployeeInfo(int employeeId){
		this.employeeId=employeeId;
	}

	public EmployeeInfo(int employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	public EmployeeInfo(int employeeId, String name, String departmentName) {
		this.employeeId = employeeId;
		this.name = name;
		this.departmentName = departmentName;
	}

	public EmployeeInfo(int employeeId, String name, String departmentName, int performance, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.departmentName = departmentName;
		this.performance = performance;
		this.salary=salary;
	}

	public static String getEmployerName() {
		return employerName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		EmployeeInfo.salary = salary;
	}

	public static double calculateBonus(double salary, int performance) {

		double bonus = 0;
		if (performance == 5) {
			bonus = salary * 0.1 * 12;
		} else if (performance == 4) {
			bonus = salary * 0.08 * 12;
		} else if (performance == 3) {
			bonus = salary * 0.05 * 12;
		} else{
			bonus = 0;
			System.out.println("Poor performance");
		}
		return bonus;
	}

	public static int calculateEmployeePension() {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the start date in format (example: May,2015): ");
		String dateOfJoin = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(dateOfJoin);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension

		if (convertedJoiningDate.endsWith("2015") && convertedTodaysDate.endsWith("2018")) {
			total = ((int) ((salary * 12) * 0.15));
		} else if (convertedJoiningDate.endsWith("2016") && convertedTodaysDate.endsWith("2018")) {
			total = ((int) ((salary * 12) * 0.10));
		} else if (convertedJoiningDate.endsWith("2017") && convertedTodaysDate.endsWith("2018")) {
			total = ((int) ((salary * 12) * 0.05));
		}
		System.out.println(" Total Pension: " + total);
		return total;
	}



	@Override
	public String toString(){
		return "Employee ID: " + employeeId + "Name: " + name + "Department: " + departmentName + "Monthly Salary: " + salary;
	}

	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}




	/*
	 * declare few static and final fields and some non-static fields
	 */
	//static String companyName;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	//public EmployeeInfo(int employeeId){

	//}
	// public EmployeeInfo(String name, int employeeId){

	//}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */


