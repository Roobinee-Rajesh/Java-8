package org.example.Generic.JavaEight;
@FunctionalInterface
interface NameConverter {
    String convertToUpperCase(String name);
}
public class G_FunctionalInterface {

    public static void main(String[] args) {
//Convert name to uppercase
        NameConverter nameToUpper = name -> name;
        String inputName = "John";
        String upperCaseName = nameToUpper.convertToUpperCase(inputName.toUpperCase());
        System.out.println("Uppercase Name: " + upperCaseName);

    }
}
