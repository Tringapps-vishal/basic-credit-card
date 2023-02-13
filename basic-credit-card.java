//  3. Design a class for a basic credit card. The class should have the following features:
//    - Instance variables for the cardholder's name, card number, and expiration date.
//    - A constructor that allows the user to create a credit card with a given name, card number, and expiration date.
//    - An equals method that returns true if the given object is a credit card with the same card number, and false otherwise.
//    - A clone method that creates and returns a new credit card with the same name, card number, and expiration date as the original credit card.
import java.util.*;
class details implements Cloneable
{
  String cname;
  String exdate;
  Long cno;
  details(String cname,Long cno,String exdate)
  {
    this.cname=cname;
    this.cno=cno;
    this.exdate=exdate;
  }
  void display()
   {
    System.out.println("Your credit card Name:"+this.cname+"");
    System.out.println("Your credit card Number:"+this.cno+"");
    System.out.println("Your credit card Expiration date:"+this.exdate+"");
   }
   public Object clone() throws CloneNotSupportedException
   {
    return super.clone();
   }
   boolean equals(Long dubcno,Long cno) 
   {
    boolean ans=(dubcno==cno) ? true:false; 
     return ans;
   }
}

class card 
{
    public static void main(String[] args) throws CloneNotSupportedException {
    Scanner sc=new Scanner(System.in);
    Scanner sc1=new Scanner(System.in);
    String cname,dubcname;
    String exdate,dubexdate;
    Long cno,dubcno;

    System.out.println("------CREATE A BASIC CREDIT CARD------");
    System.out.printf("Enter the credit cardholder's name: ");
    cname=sc.nextLine();
    System.out.printf("Enter the credit card number: ");
    cno=sc.nextLong();
    System.out.printf("Enter the credit card expiration date: ");
    exdate=sc1.nextLine();

    details d=new details(cname, cno, exdate);
    details dclone=(details)d.clone();
    
    
    System.out.println("\n ------DOBLICATE CARD DETAILS------");  
    System.out.printf("Enter the credit cardholder's name: ");
    dubcname=sc1.nextLine();
    System.out.printf("Enter the credit card number: ");
    dubcno=sc.nextLong();
    System.out.printf("Enter the credit card expiration date: ");
    dubexdate=sc1.nextLine();
    details dub=new details(dubcname, dubcno, dubexdate);
    System.out.printf("\n Cloned Details of Orginal card : \n\n");
    dclone.display();
    System.out.printf("\n Details of Dublicate card : \n\n");
    dub.display();
    boolean ans=dclone.equals(dubcno,cno);
    if(ans==true)
    System.out.printf("\n Both Credit Card Numbers are Same. ");
    else
    System.out.printf("\n Both Credit Card Numbers are Not Same.");
  }
}