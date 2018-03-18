package ceng.anadolu.bim492;

public abstract class Car {
    String description = "Standart Car";

        public String getDescription(){
            return description;
        }

        public abstract double price();

}
