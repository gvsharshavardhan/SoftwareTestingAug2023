package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        /**
         * apples : 10
         * bread : 1
         * rice : 2
         * decoration : xyz agency
         * food : xyz catering service
         * baraath :
         *
         */

        /**
         * 10
         * 20
         * 30
         * java
         * false
         *
         */

        /**
         * 1. Stores the values in KEY : VALUE format
         * 2. Can store any datatype, both key and values
         * 3. size is not fixed
         * 4. Keys : cannot be duplicate
         * 5. Values: can be duplicate
         * 6. Null is acceptable
         * 7. when you add duplicate key , it will replace the value of old key, but it will add it as a new key
         * 8. Insertion order is not preserved.
         */

        HashMap map = new HashMap<>();
        map.put("apples", 10);
        map.put("food supply", "A2Z catering service");
        map.put("rice", 5);
        map.put("is harsha available", false);
        map.put(50, "chairs required");
        map.put(null, null);
        map.put(null, "harsha");
        map.put("APPLES", 50);

        System.out.println(map);


        map.remove(null);

        System.out.println(map);

        int x = (Integer) map.get("APPLES");
        System.out.println(x);

        Set keys = map.keySet();
        System.out.println(keys);

        for (Object z : keys) {
            System.out.println(z + " :: " + map.get(z));
        }


    }
}
