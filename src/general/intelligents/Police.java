package general.intelligents;

import general.Territory;
import general.Tires;
import general.objects.Bag;

public class Police extends Intelligent {
    public Police (String nm){
        Name = nm;
    }
    public void universalIntelligent() {
        System.out.println(Name + " приняли ряд необходимых мер");
    }
    public void ransack(){
        System.out.println(Name+" обшарили все "+ Territory.FRONTAGE.GetValue()+" и "+ Territory.COURTYARDES.GetValue()+ Bag.found2());
    }
    public void check(){
        System.out.println(Name + " захотели проверить наличие денег " + Tires.found2());
    }

}
