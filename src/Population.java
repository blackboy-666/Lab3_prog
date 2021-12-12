public class Population extends Intelligent{
    public Population(String nm){
        Name = nm;
    }
    @Override
    public void turned_on() {
        System.out.println(Name + " включилось в поиски");
    }
}
