package general;

import general.intelligents.*;
import general.objects.*;

public class Main {
    public static <City2> void main(String[] args) throws Exceptions.ScenarioException {
        try {
            Police police = new Police("Полицейские");
            Readers readers = new Readers("Читатели");
            Population population = new Population("Население");
            Car car = new Car("автомобиль");
            Robbers robbers = new Robbers("бандиты");
            BankTeller bank_teller = new BankTeller("Банковский кассир");
            Bock bock = new Bock("Бок");
            Ghost ghost = new Ghost("Привидение");
            City city2 = new City();
            Courtyard courtyard = new Courtyard();
            Bag bag = new Bag();
            Cat cat = new Cat();
            Wall wall = new Wall();
            readers.report();
            police.universalIntelligent();
            bank_teller.universalIntelligent();
            bank_teller.swear();
            police.ransack();
            courtyard.universal();
            bag.universal();
            cat.universal();
            wall.universal();
            police.check();
            car.universal();
            population.universalIntelligent();
            city2.another();
            ghost.universal();
            bock.universalIntelligent();
            int a = 5;
            a = a/0;
        }catch(Exception e){
            System.err.println("что то пошло не так: " + e.getMessage());
            throw new Exceptions.ScenarioException();
            }
        }
    }

