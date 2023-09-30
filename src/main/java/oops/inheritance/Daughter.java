package oops.inheritance;

public class Daughter extends Father {

    public String cash = "100M";

    public String gold = "500kg";

    public Daughter(String gold){
        super(gold);
        this.gold = gold;
    }

    public void softwareDeveloper(){
        System.out.println("java developer");
    }

    public void goldBusiness(){
        System.out.println(gold);//500kg
        System.out.println(super.gold);//100kg
        super.goldBusiness();//gold business
        System.out.println("stocks gold business");
    }
}
