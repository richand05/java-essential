package com.richand05;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<String> list = List.of("Richard", "Andrea","Juana","Juan","Ana","Maria","Anabel","Ana");

        Set<String> stringSet= list.stream()
                .filter(name -> name.length()<7)
                .collect(Collectors.toSet());

        System.out.println(stringSet);

    }
}
