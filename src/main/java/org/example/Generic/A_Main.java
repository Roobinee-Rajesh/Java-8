package org.example.Generic;
import java.util.ArrayList;

public class A_Main {
    public static void main(String[] args) {
        CustomList<String> stringList=new CustomList<>();
        stringList.addElement("Element1");
        stringList.addElement("Element2");

        CustomList<Integer> integerList=new CustomList<>();
        integerList.addElement(1);
        integerList.addElement(2);
    }


}
