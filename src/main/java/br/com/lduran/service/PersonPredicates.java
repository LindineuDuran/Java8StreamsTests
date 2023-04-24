package br.com.lduran.service;

import br.com.lduran.model.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonPredicates
{
	public static Predicate<Person> isAgeMoreThan(int age)
	{
		return p -> p.getAge() >= age;
	}

	public static Predicate<Person> isSalaryMoreThan(double salary)
	{
		return p -> p.getSalary() > salary;
	}

	public static Predicate<Person> isAgeAndSalaryMoreThan(int age, double salary)
	{
		return p -> p.getAge() >= age && p.getSalary() > salary;
	}

	public static List<Person> filterPersons (List<Person> employees,
			Predicate<Person> predicate)
	{
		return employees.stream()
				.filter( predicate )
				.collect(Collectors.<Person>toList());
	}
}
