package org.example.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomList<T> {
    private ArrayList<T> arrayList=new ArrayList<>();
    public void addElement(T value){
        arrayList.add(value);
    }

    public void removeElement(T value){
        arrayList.remove(value);
    }

}
