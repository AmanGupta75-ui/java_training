/*
rules of constructor:-
1. name of classs and the name of constructor should be same
 at the time of object creation  ,constructor shouled be exicuted
 3.
















 */
 class student2 {
    int rollno;
    String name;
    String address;
    long phoneno;

    student2(int rollno, String name, String address, long phoneno) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;


    }

    void displaystudentrecords() {
        System.out.println("rollno:" + rollno);
        System.out.println("name:" + name);
        System.out.println("address:" + address);
        System.out.println("phoneno:" + phoneno);
    }
}

public class student1{
    public static void main(String[] args) {



    }
}