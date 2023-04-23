package br.com.lduran.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToListTests
{
    Map<String, Integer> asciiMap;
    ArrayList<String> result;

    ArrayList<String> resultKeys;
    ArrayList<Integer> resultValues;

    @Before
    public void setUp()
    {
        asciiMap = new HashMap<>();

        asciiMap.put("A", 65);
        asciiMap.put("B", 66);
        asciiMap.put("C", 67);

        result = new ArrayList<String>();
        result.add("A=65");
        result.add("B=66");
        result.add("C=67");

        resultKeys = new ArrayList<String>();
        resultKeys.add("A");
        resultKeys.add("B");
        resultKeys.add("C");

        resultValues = new ArrayList<Integer>();
        resultValues.add(65);
        resultValues.add(66);
        resultValues.add(67);
    }

    @Test
    public void deveRetornarMapAscii()
    {
        // list to store mappings
        List<Map.Entry<String, Integer>> entries = MapToList.convertToList(asciiMap);

        Assert.assertEquals(entries.toString(), result.toString());
    }

    @Test
    public void deveRetornarMapAsciiShorter()
    {
        // list to store mappings
        List<Map.Entry<String, Integer>> entries = MapToList.convertToListShorter(asciiMap);

        Assert.assertEquals(entries.toString(), result.toString());
    }

    @Test
    public void deveRetornarKeys()
    {
        // list to store mappings
        List<String>  entries = MapToList.convertToListOfKeys(asciiMap);

        Assert.assertEquals(entries.toString(), resultKeys.toString());
    }

    @Test
    public void deveRetornarKeysShorter()
    {
        // list to store mappings
        List<String>  entries = MapToList.convertToListOfKeysShorter(asciiMap);

        Assert.assertEquals(entries.toString(), resultKeys.toString());
    }

    @Test
    public void deveRetornarValues()
    {
        // list to store mappings
        List<Integer>  entries = MapToList.convertToListOfValues(asciiMap);

        Assert.assertEquals(entries.toString(), resultValues.toString());
    }

    @Test
    public void deveRetornarValuesShorter()
    {
        // list to store mappings
        List<Integer>  entries = MapToList.convertToListOfValuesShorter(asciiMap);

        Assert.assertEquals(entries.toString(), resultValues.toString());
    }
}
