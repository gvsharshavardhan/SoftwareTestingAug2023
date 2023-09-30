package Strings;

public class StringsDemo {

    public static void main(String[] args) {

        String name = "java programming";
        System.out.println(name.charAt(6));
        System.out.println(name.length());

        System.out.println(name.contains("gram"));

        String a = "abc";
        String b = "ABC";

        System.out.println(a.equalsIgnoreCase(b));

        String c = "";
        System.out.println(c.isEmpty());

        String names [] = name.split("g");
        for( String x : names){
            System.out.println(x);
        }

        System.out.println( name.substring(8,12));

        System.out.println(name.replace("g","@"));

        String x = "abc";
        String y = "ABcdEF";
        System.out.println(x.concat(y));

        System.out.println(y.toUpperCase());










    }
}
