package ceng.anadolu.bim492;

public class SurroundSound extends Configurator{
    Car car;

    public SurroundSound(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", surround sound system";
    }

    @Override
    public double price() {
        return 8000.0 + car.price() ;
    }
}
