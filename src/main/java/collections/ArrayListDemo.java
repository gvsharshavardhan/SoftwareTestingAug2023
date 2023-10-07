package collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        /**
         * Properties:
         * 1. it can store different datatypes
         * 2. size is dynamic
         * 3. you can add null values
         * 4. it will accept duplicates
         * 5. insertion order is preserved
         * 6. accepts multiple NULL values
         */

        ArrayList  values = new ArrayList<>();
        values.add(10);
        values.add(12.3);
        values.add(15.6);
        values.add("java");
        values.add(new ArrayListDemo());
        values.add(false);
        values.add(null);
        values.add(15.6);
        values.add(null);

        System.out.println(values);


        values.remove("java");
        System.out.println(values);

        values.remove(6);
        System.out.println(values);

        values.set(3,"collections");
        System.out.println(values);

        System.out.println(values.size());
        values.add(2,"good morning");
        System.out.println(values);

        //length - Array
        //length() - String
        //size() - Arraylist

        for(int i=0; i<values.size();i++){
            System.out.println(values.get(i));
        }
        System.out.println("====================================================================================");
        for(Object x : values){
            System.out.println(x);
        }


    }
}
