package design;

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
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.setEmployeeId(101);
		emp1.setName("Courtney Pulley");
		emp1.setSalary(6000);
		emp1.setDepartmentName("IT");

		System.out.println("Emp1" + " " + emp1.toString());
		emp1.calculateBonus(6000, 5);

		emp1.calculateEmployeePension();
		System.out.println("___________");



		EmployeeInfo emp2 = new EmployeeInfo();
		emp2.setEmployeeId(206);
		emp2.setName("Ahmad Dib");
		emp2.setSalary(7000);
		emp2.setDepartmentName("IT");
		System.out.println("Emp2" + " " +emp2.toString());


		EmployeeInfo emp3 = new EmployeeInfo(307, "Mary Jane");
		System.out.println("Emp3" +emp3.toString());
		emp3.setSalary(4000);
		emp3.calculateBonus(4000, 4);
		System.out.println("__________");

	}

}