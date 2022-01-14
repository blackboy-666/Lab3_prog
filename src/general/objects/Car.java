package general.objects;

import general.intelligents.Robbers;

public class Car extends Objects {
    public Car(String nm){
        Name = nm;
    }
    Robbers robbers = new Robbers("бандиты");
    @Override
    public void universal() {
        System.out.println("Но "+ Name + robbers.got_away() + ", исчез");
    }

}
