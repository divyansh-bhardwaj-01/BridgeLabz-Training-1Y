class Animal{
    void eat(){
        System.out.println("Animal is  eating");
    }
}
    
    class dog extends Animal{
        void bark(){
            System.out.println("Dog is barking");
        }
    }
    
    public class Inheritance{
        public static void main(String[] args){
            dog sc=new dog();
            sc.bark();
            sc.eat();
        }
    }
