package org.example;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class App {

    public static void main( String[] args ) {
        Module module = new Module();
        ArrayList<Integer> arr = new ArrayList<>();

        try {
            Field field = module.getClass().getDeclaredField("arr");
            field.setAccessible(true);
            arr = (ArrayList<Integer>) field.get(module);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        arr.stream().forEach(System.out::println);
    }
}