 
class MethodOverloading {
    void addition(int a,int b){
       System.out.println(a+b);
        
    }
    void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
         int a=10;
         int b=10;
         int c=10;
         MethodOverloading obj=new MethodOverloading();
         obj.addition(a,b);
         obj.addition(a,b,c);
    }
}