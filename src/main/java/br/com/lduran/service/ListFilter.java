package br.com.lduran.service;

import br.com.lduran.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilter
{
	public List<Employee> filterListBasedInOthersUsingLambda(List<Employee> originalList, List<String> nameFilter)
	{
		return originalList.stream()
				.filter(employee -> nameFilter.contains(employee.getName()))
				.collect(Collectors.toList());
	}

	public List<String> geraListaNomes(List<Employee> originalList)
	{
		return originalList.stream().map(a -> a.getName()).collect(Collectors.toList());
	}
}
