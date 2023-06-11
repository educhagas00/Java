package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registred?");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("Employee #" + i);
			System.out.println("Id: ");
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id_search = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id_search).findFirst().orElse(null);
		
		if(emp == null){
			System.out.println("This id does not exist!");	
		}
		else
		{
			System.out.println("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			
			emp.increaseSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		
		for(Employee employee : list)
		{
			System.out.println(employee.toString());
		}
		
		sc.close();
	}
}
