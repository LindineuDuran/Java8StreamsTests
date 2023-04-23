package br.com.lduran.service;

import br.com.lduran.model.Employee;
import br.com.lduran.util.ListUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FilteringListsTest
{
	ListUtil listUtil;
	List<Employee> originalList;
	List<String> nameFilter;
	List<Employee> filteredList;
	List<String> namesList;

	ListFilter listFilter;

	@Before
	public void setUp()
	{
		listUtil = new ListUtil();
		originalList = listUtil.buildEmployeeList();
		nameFilter = listUtil.employeeNameFilter();
		filteredList = listUtil.filteredList();
		namesList = listUtil.allEmployeeNames();

		listFilter = new ListFilter();
	}

	@Test
	public void deveRetornarListaDeObjetosFiltradaPorListaDeNomesUsandoLambda()
	{
		List<Employee> testedList = listFilter.filterListBasedInOthersUsingLambda(originalList, nameFilter);

		Assert.assertEquals(testedList, filteredList);
		Assert.assertNotEquals(testedList, originalList);
	}

	@Test
	public void deveRetornarListaDeNomesDosEmpregados()
	{
		List<String> testedList = listFilter.geraListaNomes(originalList);

		Assert.assertEquals(testedList, namesList);
		Assert.assertNotEquals(testedList, nameFilter);
	}
}
