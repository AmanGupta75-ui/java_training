public class student {

 int rollnumber;


    public static void main(String[] args) {



        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        s1.rollnumber=4352;
        s2.rollnumber=45829;
        s3.rollnumber=76582;
        System.out.println(s1.rollnumber);
        System.out.println(s2.rollnumber);
        System.out.println(s3.rollnumber);
        



    }
}