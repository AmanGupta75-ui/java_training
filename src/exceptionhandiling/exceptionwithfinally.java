package exceptionhandiling;

public class exceptionwithfinally {
    public static void main(String[] args) {
        try {
            System.out.println("hii");
            System.out.println(10/0);


        }
        catch (ArithmeticException ae){
            System.out.println("byy");
        }
        finally {
            System.out.println("hiii");
        }

    }
}
