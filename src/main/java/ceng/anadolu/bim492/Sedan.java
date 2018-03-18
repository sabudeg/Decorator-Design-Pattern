package ceng.anadolu.bim492;

public class Sedan extends Car {

    public Sedan() {
        description = "Sedan";
        }

    @Override
    public double price() {
        return 50000.00;
    }
}

