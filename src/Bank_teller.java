public class Bank_teller extends Intelligent{
    public Bank_teller(String nm){
        Name = nm;
    }
    @Override
    public void arrested(){
        System.out.println("Был арестован " + Name);
    };
    public void swear(){
        System.out.println(Name + " клялся, что не брал " + Money.found2());
    };
}
