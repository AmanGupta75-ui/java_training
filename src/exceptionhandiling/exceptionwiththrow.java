package exceptionhandiling;
class  nonexception extends Exception{
    nonexception(String num){
        super(num);
    }
}

public class exceptionwiththrow {
    public static void main(String[] args) throws nonexception
    {
        nonexception eqq= new nonexception("my exception");
        throw eqq;

    }
}
