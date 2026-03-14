class student {
    public int age;
    
     void setage(int a){
         age=a;
     } 
     int getage(){
         return age;
     }
}
     public class Encapsulation{
         public static void main(String[] args){
             student sc=new student();
             sc.setage(20);
             System.out.println(sc.getage());
         }
     }
