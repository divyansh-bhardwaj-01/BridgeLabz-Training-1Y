class Animal{
    void parent(){
        System.out.println("Animal=Parent");
    }
}
class dog extends Animal{
    void child(){
        System.out.println("dog=child of Animal");
    }
}

class puppy extends dog{
    void dogchild(){
         System.out.println("puppy=child of dog");
    }
}
class MultilevelInheritance{
    public static void main(String[] args){
        puppy d=new puppy();
        d.child();
        d.parent();
        d.dogchild();
    }
}