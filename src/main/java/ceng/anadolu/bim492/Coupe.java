package ceng.anadolu.bim492;

public class Coupe extends Car{

    public Coupe(){
            description = "Coupe";
    }

    @Override
    public double price() {
        return 70000.00;
    }
}
