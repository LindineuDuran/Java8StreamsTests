package br.com.lduran.service;

import br.com.lduran.model.Empregado;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpregadoPredicates
{
    public static Predicate<Empregado> isAdultMale()
    {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Empregado> isAdultFemale()
    {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Empregado> isAgeMoreThanOrEqual(int age)
    {
        return p -> p.getAge() >= age;
    }

    public static List<Empregado> filterEmployees(List<Empregado> employees, Predicate<Empregado> predicate)
    {
        return employees.stream().filter(predicate).collect(Collectors.<Empregado>toList());
    }
}
