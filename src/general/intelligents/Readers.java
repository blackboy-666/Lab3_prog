package general.intelligents;

public class Readers extends Intelligent {
    public Readers (String nm){
        Name = nm;
    }
    @Override
    public void universalIntelligent() {
    System.out.println(Name + " сообщили ценные сведения");
    }
}
