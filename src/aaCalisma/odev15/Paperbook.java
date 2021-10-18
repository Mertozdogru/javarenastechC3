package aaCalisma.odev15;
//PaperBook should have
//        title,author,price,pages
//        readBook()
//        tostring()
public class Paperbook extends book{
     int pages;
     public Paperbook(String title,String author,Double price,int pages){
         this.title=title;
         this.author=author;
         this.price=price;
         this.pages=pages;

     }
public void readBook(){
        System.out.println(" this book is "+ title+" by "+ author+" has"+" "+ pages+" pages");




    }
}
