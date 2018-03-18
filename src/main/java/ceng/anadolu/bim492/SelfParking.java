package ceng.anadolu.bim492;

public class SelfParking extends Configurator {
    Car car;

    public SelfParking(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", self-parking";
    }

    @Override
    public double price() {
        return 4000.0 + car.price() ;
    }
}
