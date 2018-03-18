package ceng.anadolu.bim492;

public class Wheel extends Configurator {
    Car car;

    public Wheel(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", steel wheels";
    }

    @Override
    public double price() {
        return 5000.0 + car.price();
    }
}
