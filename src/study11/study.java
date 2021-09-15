package study11;

public class study {
    public static void main(String[] args) {
        //to command everything choose all line in the class and then
//click on command + / for mac users
//click on ctrl + / for windows users

        //to create a new project
//click on file  and click on new project

//to go previous step
//click on ctrl + z  or command + z

        int[] numbrs={1,2,3,4,5,6,7,8,9,10};
        int lastindex=numbrs.length-1;
        for (int i=0;i<=lastindex;i++){
            if (numbrs[i]%2==0){
                System.out.println(numbrs[i]+ "is Even");
            }else System.out.println(numbrs[i]+ "is Odd");
        }

        System.out.println("*****************");
        int [] numList = {-2,-5, 45 , 50 ,60,100,4};

        for (int i=0; i<numList.length; i++){
            if (numList[i]%2==0){
                System.out.println(numList[i]+ ", ");
            }
        }



    }



}
