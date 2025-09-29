package exceptionhandiling;

import java.util.Scanner;
class tooOldException extends RuntimeException{
    tooOldException(String msg){
        super(msg);
    }
}
class tooyoungException extends RuntimeException{
    tooyoungException(String msg){
        super(msg);
    }
}

public class customexception {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("please enter your age");
        int age=sc.nextInt();
        if(age<21){

            throw new tooOldException("too old");

        }
        else if(age>30){
            throw new tooyoungException(" too young");
        }
         else {
            System.out.println("not too old not too young");
        }


    }
}
