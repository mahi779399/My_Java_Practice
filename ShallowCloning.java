import java.lang.Cloneable;
class ShallowInternalInstance{
    public int a=10;
}
public class ShallowCloning implements Cloneable {
    public String name="name_name";
    public int age=0;
    public ShallowInternalInstance internalInst=new ShallowInternalInstance();
    public ShallowCloning(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        ShallowCloning obj1=new ShallowCloning("Mahi",22);
        ShallowCloning obj2=(ShallowCloning)obj1.clone();//2
        System.out.println(obj1.name+" : "+obj1.age+" : "+obj1.internalInst.a);
        System.out.println(obj2.name+" : "+obj2.age+" : "+obj2.internalInst.a);
        obj1.name="hai";
        obj2.age=1;
        obj1.internalInst.a=20;
        System.out.println(obj1.name+" : "+obj1.age+" : "+obj1.internalInst.a);
        System.out.println(obj2.name+" : "+obj2.age+" : "+obj2.internalInst.a);
    }
}
