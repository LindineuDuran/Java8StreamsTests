package br.com.lduran.service;

import br.com.lduran.model.Car;
import br.com.lduran.model.Color;
import org.jooq.lambda.Seq;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * https://blog.jooq.org/2015/08/13/common-sql-clauses-and-their-equivalents-in-java-8-streams/
 * Common SQL Clauses and Their Equivalents in Java 8 Streams
 *
 * @author lsdur
 *
 */
public class SQLInStream
{
	/**
	 * Exemplo de Select em Stream()
	 */
	public void select(Stream<Car> sCars)
	{
		sCars.map(s -> "Car [name=" + s.getName() + ", modelo=" + s.getModelo() + ", color=" + s.getColor() + "]").forEach(System.out::println);
	}
	
	/**
	 * Exemplo de Where em Stream()
	 */
	public void where(Stream<Car> sCars)
	{
		sCars.filter(s -> s.getName().equals("Mercedes")).forEach(System.out::println);
	}
	
	/**
	 * Exemplo de Left Outer Join em Stream()
	 */
	public void leftOuterJoinUsandoStream(Stream<Car> sCars, Stream<Color> sColors)
	{
		Seq.seq(sCars).leftOuterJoin(Seq.seq(sColors), (t, u) -> Objects.equals(t.getColor(), u.getId())).forEach(System.out::println);
	}

	/**
	 * Exemplo de Left Outer Join em Seq()
	 */
	public void testaLeftOuterJoinUsandoSeq(Seq<Car> sCars, Seq<Color> sColors)
	{
		sCars.leftOuterJoin(sColors, (t, u) -> Objects.equals(t.getColor(), u.getId())).forEach(System.out::println);
	}
}
