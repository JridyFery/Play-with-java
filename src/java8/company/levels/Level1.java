package java8.company.levels;

import java8.company.Data.Data;
import java8.company.model.Employee;

import java.util.Comparator;
import java.util.List;

public class Level1 {
    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

		// Print all employees
        employees.stream().forEach(employee -> System.out.println(employee.toString()));


		//Display employees whose names start with "n"

        employees.stream().filter(employee -> employee.getName().startsWith("n")).forEach(System.out::println);

		// print all employees with > 1000 as a salary and the name start with "n"
        employees.stream().filter(employee -> employee.getName().startsWith("n")).filter(employee -> employee.getSalary()>1000)
                .forEach(System.out::println);

		/*
		  TO DO 4: Afficher les employés dont le nom commence par la lettre s triés par salaire
		 */
        employees.stream()
                .filter(employee -> employee.getName()
                .startsWith("s"))
                .sorted((Comparator.comparing(Employee::getSalary)))
                .forEach(employee -> System.out.print(employee));

		/*
		  TO DO 5: Afficher les noms des employés dont le salaire > 600 avec 2  manières différentes
		 */
		// First method
        employees.stream()
                .filter(employee-> employee.getSalary()>600)
                .forEach(employee -> System.out.print(employee.getName()));
		// Second method
        employees.stream()
                .filter(employee -> employee.getSalary() > 600)
                .map(employee -> employee.getName())
                .forEach(System.out::println);

		/*
		 TO DO 6: Ajouter 200 D pour les employés dont le nom commence avec m
		  et les affiches ensuite
		 */
        employees.stream()
                .filter(employee -> employee.getName().startsWith("m"))
                .forEach(employee -> {
                    employee.setSalary(employee.getSalary()+200);
                    System.out.println(employee.toString()
                    );
                });
    }
} 