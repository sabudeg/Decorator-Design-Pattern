package ceng.anadolu.bim492;

public class Suv extends Car{
    public Suv() {
        description = "SUV";
    }

    @Override
    public double price() {
        return 60000.00;
    }
}
