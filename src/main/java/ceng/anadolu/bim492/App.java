package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {
        System.out.println("Test project 1");

        Car car = new Sedan();
        System.out.println("Cost: "+ car.price() + " TRY " + " Car features: " + car.getDescription());

        Car car2 = new Coupe();
        car2 = new Sunroof(car2);
        car2 = new Navigation(car2);
        car2 = new LeatherSeat(car2);
        car2 = new Wheel(car2);
        System.out.println("Cost: "+ car2.price() + " TRY " + " Car features: " + car2.getDescription());

        Car car3 = new HatchBack();
        car3 = new LeatherSeat(car3);
        car3 = new SelfParking(car3);
        System.out.println("Cost: "+ car3.price() + " TRY " + " Car features: " + car3.getDescription());

        Car car4 = new Suv();
        car4 = new Navigation(car4);
        car4 = new Sunroof(car4);
        car4 = new SurroundSound(car4);
        System.out.println("Cost: "+ car4.price() + " TRY " + " Car features: " + car4.getDescription());

    }
}
