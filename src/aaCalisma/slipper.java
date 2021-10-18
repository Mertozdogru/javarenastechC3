package aaCalisma;



public class slipper {
    // /*task1
// create a class called slipper
//Attributes:
//   brand, size , color
//Actions:
//   wear(), setSlipperInfo,  toString;
//    //create a slipper object class to set 5 slipper object and print slipper info
////  */
//// /*
    String brand;
    int size;
    String color;

    public void wear() {
        System.out.println("Person is wearing " + brand);
    }

    public void getSlipperInfo() {
        System.out.println(brand + "," + size + "," + color);
    }
    public void setSlipperInfo(String shoeBrand ,int shoeSize,String shoeColor){
        brand = shoeBrand;
        size = shoeSize;
        color = shoeColor;
    }
    public String toSring() {return brand+color+size;}
}
