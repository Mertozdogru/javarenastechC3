package aaCalisma;

public class carClass {

    // /*task2
// create a class called Car
//Attributes:
//   brand, model
//Actions:
//   printBrand(), -- to print car brand
//   drive() , -- to print person drive car brand
//   stop() -- to print person stopped the car brand
//   //setCarinfo() to set car brand and model
//   //toString to print car brand and model with -
//  */
// /*
    String brand;
    String model;

    public void printBrand() {
        System.out.println(" brand = " + brand);
    }

    public void drive() {
        System.out.println(" Person is driving " + brand + " car");
    }

    public void stop() {
        System.out.println(" Person stopped " + brand + " car");
    }

    public void setCarinfo(String carBrand, String carModel) {
        brand = carBrand;
        model = carModel;
    }

    public void getCarinfo() {
        System.out.println("brand and model = " + brand + model);
    }

    public String toString() {
        return brand + model;
    }


}
