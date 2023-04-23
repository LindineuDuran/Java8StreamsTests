package br.com.lduran.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import br.com.lduran.model.Pessoa;

public class WorkWithPredicatesTests
{
    WorkWithPredicates predicates;

    Pessoa p1;
    Pessoa p2;

    @Before
    public void setUp()
    {
        predicates = new WorkWithPredicates();

        p1 = new Pessoa("João", 20);
        p2 = new Pessoa("Carlos", 16);
    }
    @Test
    public void deveRetornarTrueSeMenorQue18()
    {
        Boolean result = predicates.simplePredicateTestaMenorQue18(10);

        Assert.assertTrue(result);
    }
    @Test
    public void deveRetornarFalseSeMaiorQue18()
    {
        Boolean result = predicates.simplePredicateTestaMenorQue18(20);

        Assert.assertFalse(result);
    }

    @Test
    public void deveRetornarTrueSeEntre10e20()
    {
        Boolean result = predicates.predicateChainingVerificaEntre2Valores(15, false);

        Assert.assertTrue(result);
    }

    @Test
    public void deveRetornarFalseSeNaoEntre10e20()
    {
        Boolean result = predicates.predicateChainingVerificaEntre2Valores(5, false);

        Assert.assertFalse(result);

        result = predicates.predicateChainingVerificaEntre2Valores(25, false);

        Assert.assertFalse(result);
    }

    @Test
    public void deveRetornarFalseSeEntre10e20MasNegado()
    {
        Boolean result = predicates.predicateChainingVerificaEntre2Valores(15, true);

        Assert.assertFalse(result);
    }
    @Test
    public void deveRetornarTrueSeMaiorQue18()
    {
        Boolean result = predicates.predicateInToFunctionAprovaPessoa(p1, (p) -> p.getIdade() > 18);

        Assert.assertTrue(result);
    }
    @Test
    public void deveRetornarFalseSeMenorQue18()
    {
        Boolean result = predicates.predicateInToFunctionAprovaPessoa(p2, (p) -> p.getIdade() > 18);

        Assert.assertFalse(result);
    }
}
