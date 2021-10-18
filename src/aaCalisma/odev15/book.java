package aaCalisma.odev15;




/*
task3
 creata a class called device:
                attributes: brand, model, price,  type
                methods: toString

create a class called TV:
                attributes: brand, model, price,Type
                methods: watch, toString
 create ba class called phone:
                attributes: brand, model, price,  type = "Phone"
                methods: call, text,  toString
 */



public class book {
        /*
task1
create 3 class  book ,  Audiobook  ,PaperBook



 */
public String title;
public String author;
public double price;

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
