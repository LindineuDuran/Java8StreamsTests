package br.com.lduran.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ManageStringTests {
	@Test
	public void deveInverterOrdemDasPalavras() {
		String text = "this sentence is inverted";
        String[] arrText = text.split(" ");
        String invertedText = arrText[3]+" "+arrText[2]+" "+arrText[1]+" "+arrText[0];

        assertEquals("inverted is sentence this", invertedText);
	}
}
