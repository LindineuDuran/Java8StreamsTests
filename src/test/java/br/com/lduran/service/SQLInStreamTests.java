package br.com.lduran.service;

import br.com.lduran.model.Car;
import br.com.lduran.model.Color;
import org.jooq.lambda.Seq;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.Stream;

public class SQLInStreamTests
{
    Stream<Car> sCars1;
    Stream<Color> sColors1;

    Seq<Car> sCars2;
    Seq<Color> sColors2;

    SQLInStream sqlInStream;

    @Before
    public void setUp()
    {
        sCars1 = Stream.of(new Car("VW", "Modelo X da VW", 1), new Car("Ford", "Modelo A da Ford", 2),
                          new Car("Chevrolet", "Modelo W da Chevrolet", 1), new Car("BMW", "Modelo K da BMW", 3),
                          new Car("Ferrari", "Modelo Y da Ferrari", 1), new Car("Mercedes", "Modelo Z da Mercedes", 2),
                          new Car("Mercedes", "Modelo Q da Mercedes", 4));

        sColors1 = Stream.of(new Color(0, "unknow", "Color Unknow"), new Color(1, "red", "Color Red"),
                            new Color(2, "green", "Color Green"), new Color(3, "blue", "Color Blue"));

        sCars2 = Seq.of(new Car("VW", "Modelo X da VW", 1), new Car("Ford", "Modelo A da Ford", 2),
                        new Car("Chevrolet", "Modelo W da Chevrolet", 1), new Car("BMW", "Modelo K da BMW", 3),
                        new Car("Ferrari", "Modelo Y da Ferrari", 1), new Car("Mercedes", "Modelo Z da Mercedes", 2),
                        new Car("Mercedes", "Modelo Q da Mercedes", 4));

        sColors2 = Seq.of(new Color(0, "unknow", "Color Unknow"), new Color(1, "red", "Color Red"),
                          new Color(2, "green", "Color Green"), new Color(3, "blue", "Color Blue"));

        sqlInStream = new SQLInStream();
    }

    @Test
    public void deveTestarSelectNaStream()
    {
        sqlInStream.select(sCars1);
    }

    @Test
    public void deveTestarWhereNaStream()
    {
        sqlInStream.where(sCars1);
    }

    @Test
    public void deveTestarLeftOuterJoinNaStream()
    {
        sqlInStream.leftOuterJoinUsandoStream(sCars1, sColors1);
    }

    @Test
    public void deveTestarLeftOuterJoinUsandoSeqNaStream()
    {
        sqlInStream.testaLeftOuterJoinUsandoSeq(sCars2, sColors2);
    }
}
