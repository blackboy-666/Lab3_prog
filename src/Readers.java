public class Readers extends Intelligent {
    public Readers (String nm){
        Name = nm;
    }
    @Override
    public void report() {
    System.out.println(Name + " сообщили ценные сведения");
    }
}
