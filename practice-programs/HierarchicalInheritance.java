class Animal{
    void parent(){
        System.out.println("Animal = Parent");
    }
}

class Dog extends Animal{
    void child(){
        System.out.println("Dog = child of Animal");
    }
}

class Puppy extends Animal{
    void dogchild(){
        System.out.println("Puppy = child of Animal");
    }
}

class HierarchicalInheritance{
    public static void main(String[] args){

        Dog d = new Dog();
        d.parent();
        d.child();

        Puppy p = new Puppy();
        p.parent();
        p.dogchild();
    }
}