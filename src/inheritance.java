/*
oop concepts:-
-----------------------
 inheritance
 ----------------------
extends keywords
resuability







 */
 class card{
     long cardno;
      void debitbalance(){
          System.out.println("amount debited");
      }

}
class debitcard extends card
{
    double amountacesslimit;
    void debitbalance(){
        System.out.println(" yes");
    }

}
class creditcard extends card
{

    double amountacesslimit;
    void cebitbalance(){
        System.out.println(" no");
    }

}

public class inheritance {
    public static void main(String[] args) {
        creditcard c1=new creditcard();
        c1.cardno=1111222233334444l;
        c1.cebitbalance();
        debitcard d1=new debitcard();
        d1.debitbalance();
    }
}
