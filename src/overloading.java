/*

case 1
 byte-> short-> int-> long->float->double
        char->int

 case2
  non premitive


 */
 class employee {

     void ans(String a){
         System.out.println("object");
     }
     void login(long mno) {
         System.out.println("login using mno");
     }

     void login(String name, String password) {
         System.out.println("login using name and password");
     }
 }

    class overloading {

        public static void main(String[] args) {
            employee e1=new employee();
              employee e2= new employee();
            e1.login(381971927181l);
            e1.login("raja","5265692");

             e1.ans( " hdskdgdsdksdd");

        }

}
