package aaCalisma;
/*
create a class called SDET
Attributes:
  name, employeeID, Salary , companyName
Actions:
  setInfo(), testing(),  creatingTicket(boolean isBug);
 */
 /*
practice task:
 create a custom class for bank account
   attrubutes: accountHolder(String), accountNumber(long), balance(double)
   actions: totalBalance(), withDraw( amount ), deposit( amount )
     toString()

create a class called bankAccountObject to call BankAccount methods,variables.
Ex : if i deposit 50 dollars my balance should increase 50 dollars
   : if i withdraw 100 dollars my balance should decrease for 100 dollars
   : to check the balance use totalBalance method
  */
public class SDET {
    String name;
    String employeeId;
    Double salary;
    String companyName;
    public void setInfo(String name,String employeeId,Double salary,String companyName){
        this.name=name;
        this.employeeId=employeeId;
        this.salary=salary;
        this.companyName=companyName;

    }
    public void getInfo(){
        System.out.println(name+"with"+employeeId+"has a salary of"+salary+"works at"+companyName);
    }
    public String toString(){
        return name+","+employeeId+","+salary+","+companyName;
    }
}
