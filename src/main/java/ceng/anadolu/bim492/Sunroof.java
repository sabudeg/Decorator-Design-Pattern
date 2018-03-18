package ceng.anadolu.bim492;

public class Sunroof extends Configurator {
        Car car;

        public Sunroof(Car car){
            this.car = car;
        }

    @Override
    public String getDescription() {
        return car.getDescription() + " with sunroof";
    }

    @Override
    public double price() {
        return 5000.0 + car.price();
    }
}
