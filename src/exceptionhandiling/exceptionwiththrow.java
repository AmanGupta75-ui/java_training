package exceptionhandiling;
class  nonexception extends Exception{
    nonexception(String num){
        super(num);
    }
}

public class exceptionwiththrow {
    public static void main(String[] args) {
        nonexception eqq= new nonexception("my exception");
    }
}
