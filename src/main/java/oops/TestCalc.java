package oops;

public class TestCalc {

    public static void main(String[] abc) {

//        Calculator calculator = new Calculator();
//
//        int a[] = {12,34,5,6,56,78,99,34,56};
//
//        calculator.add(12,34,56);
//        calculator.add(a);

//        Employee e = new Employee(101,"ramya",2000);
//        Employee e1 = new Employee();
//
//        Employee.add();


        Flat f1 = new Flat();
        f1.light_switch = "on";
        Flat.stove = "on";

        Flat f2 = new Flat();
        f2.light_switch = "off";
        f2.stove = "off";

        Flat f3 = new Flat();
        f3.light_switch = "not working";
        f3.stove = "repair";

        System.out.println(f1.light_switch);//on
        System.out.println(f2.light_switch);//off
        System.out.println(f3.light_switch);//not working
        System.out.println(f1.stove);//repair
        System.out.println(f2.stove);//repair
        System.out.println(f3.stove);//repair
        System.out.println(Flat.stove);//repair

    }



}
