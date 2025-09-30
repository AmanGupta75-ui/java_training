package exception;



public class product {
    int pid;
    String name;
    int price;

    public product(int pid,String name,int price) {
        this.pid = pid;
        this.name= name;
        this.price=price;
    }

    public static void main(String[] args) {
        product[] products= new product[3];
        products[0]= new product(299 ,"mouse",5999);
        products[1]= new product( 300,"keyboard",2999);
        products[2]= new product(301,"pendrive",1599);

    }



    product getproduct(product p){


        return p;
    }




}
