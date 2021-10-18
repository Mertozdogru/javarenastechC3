package aaCalisma;
//  Task Device:
//        creata a class called device:
//                attributes: brand, model, price, country
//                methods: toString
//
//        create a class called TV:
//                attributes: brand, model, price, country
//                methods: watch, toString
//
//        create a class called phone:
//                attributes: brand, model, price, country
//                methods: call, text,  toString

public class Device {
    String brand;
    String model;
    Double price;
    String country;
public Device(String brand,String model,Double price,String country){
    this.brand=brand;
    this.model=model;
    this.price=price;
    this.country=country;

}
    public String toString(){
        return brand+" + "+model+" + "+price+" + "+country;
    }
    }

