package oops;

public class TestDemo {

    public static void main(String[] args) {

//        Car c1 = new Car();
//        System.out.println(c1.noOfWheels);
//        System.out.println(c1.tankCapacity);
//        System.out.println(c1.noOfSeats);
//
//        c1.drive();
//        c1.refuel();

        BankAccount r = new BankAccount(1000,"ramya","ramya123");
        System.out.println(r.balance);//1000

        r.deposit(100);

        System.out.println(r.returnMyBalance());//1100

        r.withdraw(200);
        System.out.println(r.returnMyBalance());//900


        BankAccount m = new BankAccount(2000,"manvi","manvi789");
        System.out.println(m.balance);//2000
        m.setBalance(400);//b = 400

        m.deposit(250);//b = 650

        System.out.println(m.returnMyBalance());//650
        System.out.println(m.withDrawAmountAndReturnTheAmount(650));//0



    }
}
