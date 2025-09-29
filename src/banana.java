class banana {
    String colour;
    String fruit;
    String taste;

}
 class bucket
 {
     void main(int a){
         System.out.println("no. of banana :"+a);

     }
     void properties(banana b1){
         System.out.println(" colour of fruit is:"+b1.colour);
         System.out.println(" taste of fruit is:"+b1.taste);
         System.out.println(" fruit is         :"+b1.fruit);

     }


 }
 class mainapp{
     public static void main(String[] args) {
         bucket b1=new bucket();
         banana obj= new banana();
         obj.colour="red";
         obj.fruit="type";
         obj.taste="yummy";
         b1.properties(obj);

     }
 }
