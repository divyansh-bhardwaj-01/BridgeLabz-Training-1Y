class ConstructorDemo{
 
 int id;
 String name;
 int age;
 
 // public ConstructorDemo(){
 //System.out.println("Constructor Program");
 //}
 
 public ConstructorDemo(int id,String name,int age){
	 this.id=id;
	 this.name=name;
	 this.age=age;
	 System.out.println("id: "+id);
	 System.out.println("name: "+name);
	 System.out.println("age: "+age);
	 
 }
 
 //void display(){
	// System.out.println("id: "+id);
	 //System.out.println("name: "+name);
	 //System.out.println("age: "+age);
	 
 //}
 
 public static void main(String[] args){
 ConstructorDemo cd=new ConstructorDemo(24,"Divyansh Bhardwaj",18);
 //System.out.println(cd);
 //cd.display();
 }
}