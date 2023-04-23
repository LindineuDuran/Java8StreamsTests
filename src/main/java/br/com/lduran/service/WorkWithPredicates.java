package br.com.lduran.service;

import br.com.lduran.model.Pessoa;

import java.util.function.Predicate;

public class WorkWithPredicates
{
    public Boolean simplePredicateTestaMenorQue18(Integer valor)
    {
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        return lesserthan.test(valor);
    }

    public Boolean predicateChainingVerificaEntre2Valores(Integer valor, Boolean negate)
    {
        // Creating predicates
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

        return negate?greaterThanTen.and(lowerThanTwenty).negate().test(valor):greaterThanTen.and(lowerThanTwenty).test(valor);
    }

    public Boolean predicateInToFunctionAprovaPessoa(Pessoa pessoa, Predicate<Pessoa> regra)
    {
        return regra.test(pessoa);
    }
}
