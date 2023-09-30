package conditionalStmts;

public class SwitchDemo {

    //mon -> go to school
    //tue -> go to grocery
    //wed -> watch movie
    //thur -> go to park
    //friday -> fasting
    //sat -> running
    //sun -> rest

    public static void main(String[] args) {

        String day = "sun";

        switch (day) {
            case "mon":
                System.out.println("go to school");
                break;
            case "tue":
                System.out.println("go to grocery");
                break;
            default:
                System.out.println("pls enter valid day!");
                break;
            case "wed":
                System.out.println("watch movie");
                break;
            case "thur":
                System.out.println("go to park");
                break;
            case "fri":
                System.out.println("fasting");
                break;
            case "sat":
                System.out.println("running");
                break;
            case "sun":
                System.out.println("rest");
                break;

        }


    }
}
