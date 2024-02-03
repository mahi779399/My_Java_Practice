import java.lang.Cloneable;
class DeepInternalInstance implements Cloneable{
    int rollNo;
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class DeepCloning implements Cloneable {
    String name;
    int age;
    // DeepInternalInstance rollNo;
    DeepInternalInstance obj1 = new DeepInternalInstance();
    public DeepCloning(String name,int age,int roll){
        this.name=name;
        this.age=age;
        this.obj1.rollNo=roll;
    }
    public Object clone() throws CloneNotSupportedException{
        DeepCloning obj2=(DeepCloning)super.clone();
        obj2.obj1=(DeepInternalInstance)obj1.clone();
        return obj2;
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        DeepCloning obj3=new DeepCloning("Mahi",22,1234);
        System.out.println(obj3.name+" : "+obj3.age+" : "+obj3.obj1.rollNo);
        DeepCloning obj4=(DeepCloning)obj3.clone();
        System.out.println(obj3.name+" : "+obj3.age+" : "+obj3.obj1.rollNo);
        System.out.println(obj4.name+" : "+obj4.age+" : "+obj4.obj1.rollNo);
        obj3.obj1.rollNo=5678;
        obj3.name="Maahi";
        System.out.println(obj3.name+" : "+obj3.age+" : "+obj3.obj1.rollNo);
        System.out.println(obj4.name+" : "+obj4.age+" : "+obj4.obj1.rollNo);
    }
}

// class Address {
//     String city;

//     public Address(String city) {
//         this.city = city;
//     }
// }

// class Person implements Cloneable {
//     String name;
//     int age;
//     Address address;

//     public Person(String name, int age, String city) {
//         this.name = name;
//         this.age = age;
//         this.address = new Address(city);
//     }

//     // Deep cloning method
//     public Object clone() throws CloneNotSupportedException {
//         Person clone = (Person) super.clone();
//         // Creating a new Address object to ensure deep cloning
//         clone.address = new Address(this.address.city);
//         return clone;
//     }
// }

// public class DeepCloningExample {
//     public static void main(String[] args) throws CloneNotSupportedException {
//         Person person1 = new Person("John", 25, "New York");
//         Person person2 = (Person) person1.clone();

//         System.out.println("Original Person: " + person1.name + ", " + person1.age + ", " + person1.address.city);
//         System.out.println("Cloned Person: " + person2.name + ", " + person2.age + ", " + person2.address.city);

//         // Modifying the original person
//         person1.name = "Jane";
//         person1.age = 30;
//         person1.address.city = "San Francisco";

//         System.out.println("\nAfter Modification:");
//         System.out.println("Original Person: " + person1.name + ", " + person1.age + ", " + person1.address.city);
//         System.out.println("Cloned Person: " + person2.name + ", " + person2.age + ", " + person2.address.city);
//     }
// }
