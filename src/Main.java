public class Main {
    public static void main(String[] args) {


        Car car1 = new Car(3.5, "Автомат", "sd123lv", 4, "Универсальный");
        Car car2= new Car(2.5, "Автомат", "fb86gf", 4, "Универсальный");
        Car car3 = new Car(3.6, "Автомат", "dd35dmd", 4, "Универсальный");

       Transport transport1 = new Transport ("Toyota", "250 SL", 2010, "Япония", "Красный", 120);
       Transport transport2 = new Transport ("Range Rover", "698", 2005, "СССР", "жёлтый", 110);
       Transport transport3 = new Transport("Линкольн", "65Н", 2015, "США", "Белый", 150);

        System.out.println(car1);
        System.out.println(transport1);
        System.out.println(car2);
        System.out.println(transport2);
        System.out.println(car3);
        System.out.println(transport3);
    }
}

