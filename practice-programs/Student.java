class Student
{
int id;
String name;
int age;
void displayDetails()
{
String status="Active";
System.out.println("ID :"+id);
System.out.println("Name :"+name);
System.out.println("Age :"+age);
System.out.println("Status :"+status);
}
public static void main(String[]args)
{
Student sc=new Student();
sc.id =24;
sc.name="Divyansh Bhardwaj";
sc.age=18;
sc.displayDetails();
}
}