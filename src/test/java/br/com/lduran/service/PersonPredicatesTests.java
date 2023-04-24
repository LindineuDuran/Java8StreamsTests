package br.com.lduran.service;

import br.com.lduran.model.Empregado;
import br.com.lduran.model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static br.com.lduran.service.EmpregadoPredicates.filterEmployees;
import static br.com.lduran.service.EmpregadoPredicates.isAdultMale;
import static br.com.lduran.service.PersonPredicates.*;

public class PersonPredicatesTests
{
    List<Person> persons;
    List<Person> personsWithAgeMoreThan30;
    List<Person> personsWithSalaryMoreThan3400;
    List<Person> personsWithAgeMoreThan30AndSalaryMoreThan3400;

    @Before
    public void setUp()
    {
        // Configura pessoas
        persons = new ArrayList();
        persons.add(new Person("Ana Maria", 25, 3200.50));
        persons.add(new Person("Bianca", 35, 3440.50));
        persons.add(new Person("Marta", 28, 5500.00));
        persons.add(new Person("Breno", 22, 3330.70));
        persons.add(new Person("Mario", 34, 2200.50));
        persons.add(new Person("Ricardo", 55, 3200.00));
        persons.add(new Person("Pietra", 26, 3400.50));
        persons.add(new Person("Fabiana", 44, 4200.60));
        persons.add(new Person("Airton", 29, 1500.50));

        personsWithAgeMoreThan30 = new ArrayList();
        personsWithAgeMoreThan30.add(new Person("Bianca", 35, 3440.50));
        personsWithAgeMoreThan30.add(new Person("Mario", 34, 2200.50));
        personsWithAgeMoreThan30.add(new Person("Ricardo", 55, 3200.00));
        personsWithAgeMoreThan30.add(new Person("Fabiana", 44, 4200.60));

        personsWithSalaryMoreThan3400 = new ArrayList();
        personsWithSalaryMoreThan3400.add(new Person("Bianca", 35, 3440.50));
        personsWithSalaryMoreThan3400.add(new Person("Marta", 28, 5500.00));
        personsWithSalaryMoreThan3400.add(new Person("Pietra", 26, 3400.50));
        personsWithSalaryMoreThan3400.add(new Person("Fabiana", 44, 4200.60));

        personsWithAgeMoreThan30AndSalaryMoreThan3400 = new ArrayList();
        personsWithAgeMoreThan30AndSalaryMoreThan3400.add(new Person("Bianca", 35, 3440.50));
        personsWithAgeMoreThan30AndSalaryMoreThan3400.add(new Person("Fabiana", 44, 4200.60));
    }

    @Test
    public void deveRetornarListaDePersonOlderThan30()
    {
        List<Person> personsWithAgeMoreThan30Test = filterPersons(persons, isAgeMoreThan(30));

        Assert.assertEquals(personsWithAgeMoreThan30Test.toString(), personsWithAgeMoreThan30.toString());
        Assert.assertNotEquals(personsWithAgeMoreThan30Test.toString(), persons.toString());
    }

    @Test
    public void deveRetornarListaDePersonWithSalaryMoreThan3400()
    {
        List<Person> personsWithAgeMoreThan30Test = filterPersons(persons, isSalaryMoreThan(3400));

        Assert.assertEquals(personsWithAgeMoreThan30Test.toString(), personsWithSalaryMoreThan3400.toString());
        Assert.assertNotEquals(personsWithAgeMoreThan30Test.toString(), persons.toString());
    }

    @Test
    public void deveRetornarListaDePersonOlderThan30WithSalaryMoreThan3400()
    {
        List<Person> personsWithAgeMoreThan30AndSalaryMoreThan3400Test = filterPersons(persons, isAgeAndSalaryMoreThan(30,3400));

        Assert.assertEquals(personsWithAgeMoreThan30AndSalaryMoreThan3400Test.toString(), personsWithAgeMoreThan30AndSalaryMoreThan3400.toString());
        Assert.assertNotEquals(personsWithAgeMoreThan30AndSalaryMoreThan3400Test.toString(), persons.toString());
    }
}
