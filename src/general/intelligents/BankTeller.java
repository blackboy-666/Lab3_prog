package general.intelligents;

import general.Money;

public class BankTeller extends Intelligent {
    public BankTeller(String nm){
        Name = nm;
    }

    public void universalIntelligent(){
        System.out.println("Был арестован " + Name);
    };
    public void swear(){
        System.out.println(Name + " клялся, что не брал " + Money.found2());
    };
}
