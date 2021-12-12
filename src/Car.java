public class Car extends Objects{
    public Car(String nm){
        Name = nm;
    }
    Robbers robbers = new Robbers("бандиты");
    @Override
    public void disappear() {
        System.out.println("Но "+ Name + robbers.got_away() + ", исчез");
    }

}
