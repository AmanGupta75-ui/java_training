class  account{
     private double balance;
     double getbal(){
         return balance;

     }

}
 class phonepay{
    void getbalance(){
        account b= new account();
        double d=b.getbal();
        System.out.println("balance"+d);
    }
 }

public class datahiding {
    public static void main(String[] args) {
        phonepay p1=new phonepay();
        p1.getbalance();
    }

}
