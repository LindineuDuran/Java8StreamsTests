package br.com.lduran.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class MapsAndFiltersTests {
	@Test
	public void deveRetornarListaDeNumerosPares() {
		Stream<Integer> numbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = numbers
					                .filter(number -> number % 2 == 0)
					                .collect(Collectors.toList());
        
        // Print the result
        System.out.println("Even Numbers: " + evenNumbers);
        
        // Creating a mutable list using Arrays.asList()
        List<Integer> listToCompare = new ArrayList<>(Arrays.asList(2,4,6,8,10));

        assertEquals(listToCompare, evenNumbers);
	}
	
	@Test
	public void deveRetornarTrueSeZeroExiste() {
		Stream<Integer> numbersAAA = Stream.of(7,6,12,0,-2,5);
        boolean hasNumberZeroAAA = numbersAAA.anyMatch(number -> number == 0);

        // Print the result
        System.out.println("Stream contains 0: " + hasNumberZeroAAA);
        
        Stream<Integer> numbersBBB = Stream.of(7,6,12,4,-2,5);
        boolean hasNumberZeroBBB = numbersBBB.anyMatch(number -> number == 0);
     
        // Print the result
        System.out.println("Stream contains 0: " + hasNumberZeroBBB);
		
		assertEquals(true, hasNumberZeroAAA);
		assertEquals(false, hasNumberZeroBBB);
	}
	
	@Test
	public void deveRetornarSomaDaLista() {
		Stream<Integer> numbers = Stream.of(1,2,3,4);
        long sum = numbers.mapToInt(Integer::intValue).sum();

        // Print the result
        System.out.println("Sum of all items: " + sum);

        assertEquals(10, sum);
	}
}
