package org.example.Generic.JavaEight;

import java.util.stream.IntStream;

public class D_IntStream {
    public static void main(String[] args) {

        //Before java-8
        int sum=0;
        for(int i=1;i<=50;i++)
        {
            sum+=i;
        }
        System.out.println("Sumof 1 to 100: "+sum);

        //Java-8
        int total= IntStream.range(1,51).sum();
        System.out.println(total);
    }
}
