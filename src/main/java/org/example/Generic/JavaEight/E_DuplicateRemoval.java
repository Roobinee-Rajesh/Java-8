package org.example.Generic.JavaEight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_DuplicateRemoval {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("a", "b", "c", "d");
        List<String> uniqueList = new ArrayList<>();
        for (String str : string) {
            if (!uniqueList.contains(str)) {
                uniqueList.add(str);
            }
        }
        System.out.println("Without using java 8 "+uniqueList);


        //Using Java-8
        List<String> uniquelist=string.stream().distinct().toList();
        System.out.println("Java 8 "+uniquelist);
    }

}
