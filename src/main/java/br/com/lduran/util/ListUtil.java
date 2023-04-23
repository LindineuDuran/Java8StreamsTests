package br.com.lduran.util;

import br.com.lduran.model.Employee;

import java.util.Arrays;
import java.util.List;

public class ListUtil
{
	public List<Employee> buildEmployeeList()
	{
		return Arrays.asList(
				new Employee(1, "Mike", 1),
				new Employee(2, "John", 1),
				new Employee(3, "Mary", 1),
				new Employee(4, "Joe", 2),
				new Employee(5, "Nicole", 2),
				new Employee(6, "Alice", 2),
				new Employee(7, "Bob", 3),
				new Employee(8, "Scarlett", 3));
	}

	public List<String> employeeNameFilter() { return Arrays.asList("Alice", "Mike", "Bob"); }

	public List<Employee> filteredList()
	{
		return Arrays.asList(
				new Employee(1, "Mike", 1),
				new Employee(6, "Alice", 2),
				new Employee(7, "Bob", 3));
	}

	public List<String> allEmployeeNames() { return Arrays.asList("Mike", "John", "Mary", "Joe", "Nicole", "Alice", "Bob", "Scarlett"); }
}
