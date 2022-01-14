package general.intelligents;

public class Robbers extends Intelligent {
    public Robbers (String nm){
        Name = nm;
    }
    @Override
    public void universalIntelligent(){}
    public String got_away() {
        return ", на котором удирали " + Name;
    }
}
