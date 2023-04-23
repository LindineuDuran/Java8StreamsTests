package br.com.lduran.service;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class PatternUsingPredicateTests
{
	@Test
	public void deveRetornarListaItensComecamComG()
	{
		// Create ArrayList of String
		// that is backed by the specified array
		List<String> list
				= Arrays
				  .asList("Geeks",
						  "For",
						  "Geek",
						  "GeeksForGeeks",
						  "A Computer Portal");

		List<String> listResult
				= Arrays
				.asList("Geeks",
						"Geek",
						"GeeksForGeeks");

		// Get the pattern
		Pattern p = Pattern.compile("^G");

		PatternUsingPredicate predicate = new PatternUsingPredicate();

		List<String> listTest = predicate.getStream(list, p);

		Assert.assertEquals(listTest, listResult);
		Assert.assertNotEquals(listTest, list);
	}
}
