public class Main{
    public static void main(String[] args){
        Police police = new Police("Полицейские");
        Readers readers = new Readers("Читатели");
        Population population = new Population("Население");
        Car car = new Car("автомобиль");
        Robbers robbers = new Robbers("бандиты");
        Bank_teller bank_teller = new Bank_teller("Банковский кассир");
        Courtyard courtyard = new Courtyard();
        Bag bag = new Bag();
        Cat cat = new Cat();
        Wall wall = new Wall();
        readers.report();
        police.take_measures();
        bank_teller.arrested();
        bank_teller.swear();
        police.ransack();
        courtyard.pitted();
        bag.found();
        cat.found();
        wall.collapse();
        police.check();
        car.disappear();
        population.turned_on();
    }
}

