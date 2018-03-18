package ceng.anadolu.bim492;

public class LeatherSeat extends Configurator {
    Car car;

    public LeatherSeat(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", leather seats";
    }

    @Override
    public double price() {
        return 4000 + car.price() ;
    }
}
