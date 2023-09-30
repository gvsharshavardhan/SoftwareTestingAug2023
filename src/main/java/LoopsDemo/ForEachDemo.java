package LoopsDemo;

public class ForEachDemo {

    public static void main(String[] args) {

        String animals[] = new String[5];
        animals[0] = "cat";
        animals[1] = "bat";
        animals[2] = "rat";
        animals[3] = "dog";
        animals[4] = "snake";


        for(String  animal : animals){
            System.out.println(animal);
        }


    }
}
