package br.com.lduran.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList
{
    // Generic method to convert `Map<K, V>` to a list of `<Map.Entry<K, V>`
    public static<K, V> List<Map.Entry<K, V>> convertToList(Map<K, V> map)
    {
        return map.entrySet()
                .stream()
                .collect(Collectors.toList());
    }

    // Generic method to convert `Map<K, V>` to a list of `<Map.Entry<K, V>`
    public static<K, V> List<Map.Entry<K, V>> convertToListShorter(Map<K, V> map) { return new ArrayList<>(map.entrySet()); }

    // Generic method to convert `Map<K, V>` to a `List<K>`
    public static<K, V> List<K> convertToListOfKeys(Map<K, V> map)
    {
        // create an empty list to store keys
        List<K> key = new ArrayList<>();

        map.entrySet().stream().forEach(entry -> {key.add(entry.getKey()); });

        return key;
    }

    // Generic method to convert `Map<K, V>` to a `List<K>`
    public static<K, V> List<K> convertToListOfKeysShorter(Map<K, V> map)
    {
        return map.keySet().stream().collect(Collectors.toList());
    }

    // Generic method to convert `Map<K, V>` to a `List<V>`
    public static<K, V> List<V> convertToListOfValues(Map<K, V> map)
    {
        // create an empty list to store values
        List<V> values = new ArrayList<>();

        map.entrySet().stream().forEach(entry -> {values.add(entry.getValue());});

        return values;
    }

    // Generic method to convert `Map<K, V>` to a `List<V>`
    public static<K, V> List<V> convertToListOfValuesShorter(Map<K, V> map)
    {
        return map.values().stream().collect(Collectors.toList());
    }
}
