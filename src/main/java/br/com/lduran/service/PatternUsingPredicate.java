package br.com.lduran.service;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 10 Ways to Create a Stream in Java
 * https://www.geeksforgeeks.org/10-ways-to-create-a-stream-in-java/
 * Create stream from a Pattern using Predicate
 **/
public class PatternUsingPredicate
{
	// Function convert a List into Stream
	public List<String> getStream(List<String> list, Pattern p)
	{
		return list.stream()
				   .filter(p.asPredicate())
				   .collect(Collectors.toList());
	}
}
