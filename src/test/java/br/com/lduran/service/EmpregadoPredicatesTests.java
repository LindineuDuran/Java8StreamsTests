package br.com.lduran.service;

import br.com.lduran.model.Empregado;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static br.com.lduran.service.EmpregadoPredicates.*;

public class EmpregadoPredicatesTests
{
    List<Empregado> empregados;
    List<Empregado> empregadosAdultMale;
    List<Empregado> empregadosAdultFemale;
    List<Empregado> empregadosComMaisDe35Anos;
    EmpregadoPredicates predicates;

    @Before
    public void setUp()
    {
        // Configura empregados
        Empregado e1 = new Empregado(1,23,"M","Rick","Beethovan");
        Empregado e2 = new Empregado(2,13,"F","Martina","Hengis");
        Empregado e3 = new Empregado(3,43,"M","Ricky","Martin");
        Empregado e4 = new Empregado(4,26,"M","Jon","Lowman");
        Empregado e5 = new Empregado(5,19,"F","Cristine","Maria");
        Empregado e6 = new Empregado(6,15,"M","David","Feezor");
        Empregado e7 = new Empregado(7,68,"F","Melissa","Roy");
        Empregado e8 = new Empregado(8,79,"M","Alex","Gussin");
        Empregado e9 = new Empregado(9,15,"F","Neetu","Singh");
        Empregado e10 = new Empregado(10,45,"M","Naveen","Jain");

        empregados = new ArrayList<>();
        empregados.addAll(Arrays.asList(new Empregado[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));

        empregadosAdultMale = new ArrayList<>();
        empregadosAdultMale.addAll(Arrays.asList(new Empregado[]{e1,e3,e4,e8,e10}));

        empregadosAdultFemale = new ArrayList<>();
        empregadosAdultFemale.addAll(Arrays.asList(new Empregado[]{e5,e7}));

        empregadosComMaisDe35Anos = new ArrayList<>();
        empregadosComMaisDe35Anos.addAll(Arrays.asList(new Empregado[]{e3,e7,e8,e10}));

    }

    @Test
    public void deveRetornarListaDeAdultosMasculinos()
    {
        List<Empregado> employeesAdultMaleTest = filterEmployees(empregados, isAdultMale());

        Assert.assertEquals(employeesAdultMaleTest.toString(), empregadosAdultMale.toString());
        Assert.assertNotEquals(employeesAdultMaleTest.toString(), empregadosAdultFemale.toString());
    }

    @Test
    public void deveRetornarListaDeAdultosFemininos()
    {
        List<Empregado> empregadosAdultFemaleTest = filterEmployees(empregados, isAdultFemale());

        Assert.assertEquals(empregadosAdultFemaleTest.toString(), empregadosAdultFemale.toString());
        Assert.assertNotEquals(empregadosAdultFemaleTest.toString(), empregadosAdultMale.toString());
    }

    @Test
    public void deveRetornarListaDeEmpregadosComMaisDe35Anos()
    {
        List<Empregado> empregadosComMaisDe35AnosTest = filterEmployees(empregados, isAgeMoreThanOrEqual(35));

        Assert.assertEquals(empregadosComMaisDe35AnosTest.toString(), empregadosComMaisDe35Anos.toString());
        Assert.assertNotEquals(empregadosComMaisDe35AnosTest.toString(), empregadosAdultMale.toString());
    }
}
