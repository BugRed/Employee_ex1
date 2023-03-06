package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] main) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<Employee>();

		System.out.print("Enter the number of Employee: ");
		int n = sc.nextInt();

		System.out.print("Outsourced(y/n)?");
		char resp = sc.next().charAt(0);

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Name: ");
			String employeeName = sc.nextLine();
			System.out.print("Hours: ");
			int employeeHours = sc.nextInt();
			System.out.print("Value per hour: ");
			double employeeValuePerHour = sc.nextDouble();

			if (resp == 'y') {
				
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				Employee employee = new OutsourceEmployee(employeeName, employeeHours, employeeValuePerHour,
						additional);
				employeeList.add(employee);

			} else {
				Employee employee = new Employee(employeeName, employeeHours, employeeValuePerHour);
				employeeList.add(employee);

			}

		}
		System.out.println("PAYMENTS: ");
		for (Employee e : employeeList) {
			System.out.print(e.getName() + " - $" + String.format("%.2f%n", e.payment()));
		}
		sc.close();
	}
}
