package general.intelligents;

public class Population extends Intelligent {
    public Population(String nm){
        Name = nm;
    }
    @Override
    public void universalIntelligent() {
        System.out.println(Name + " включилось в поиски");
    }
}
