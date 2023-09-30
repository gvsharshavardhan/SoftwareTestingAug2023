package conditionalStmts;

public class IfConditionDemo {

    //100 to 80 and 80 -> grade A
    //select either eng or french
    //80 to 40 and 40 -> grade B
    //below 40 -> fail


    public static void main (String[] args){

        int marks = 89;
        char lang = 'f';

        if(marks>=80 && marks <=100){
            System.out.println("GradeA");

            if(lang == 'e'){
                System.out.println("Im selecting eng lang");
            }else if(lang == 'f'){
                System.out.println("Im going with french lang");
            }else {
                System.out.println("pls enter valid lang input");
            }

        }else if(marks >= 40 && marks < 80 ){
            System.out.println("Grade B");
        }else if(marks < 40 && marks >= 0){
            System.out.println("Fail");
        }else {
            System.out.println("Pls Enter valid input!!");
        }





    }

}
