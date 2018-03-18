package ceng.anadolu.bim492;

public class Navigation extends Configurator {
    Car car;

    public Navigation(Car car){
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", navigation";
    }

    @Override
    public double price() {
        return 2000.0 + car.price() ;
    }
}
