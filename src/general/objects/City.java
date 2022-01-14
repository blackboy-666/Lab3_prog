package general.objects;

public class City {
    public City() {
    }

    public void another() {
        System.out.println("В другом районе происходило следующее:");
    }
    class Town {
    City city2 = new City() {
        public void another() {
            System.out.println("На другом конце города происходило следующее:");
        }
    };
}
}