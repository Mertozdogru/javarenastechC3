package aaCalisma.odev15;

public class bookObject {
    public static void main(String[] args) {
        Audiobook audiobook1=new Audiobook();
        audiobook1.price=3.3;
        audiobook1.length=134;
        audiobook1.title="Coding";
        audiobook1.author="Mert";
        audiobook1.listen();
        System.out.println("audiobook1 = " + audiobook1);
        Paperbook paperbook1=new Paperbook("title name","author name",10.4,1842);
        paperbook1.readBook();
        System.out.println("paperbook1 = " + paperbook1);


    }
}
