class CloneInternalInstance{
    public int a=10;
}
public class ObjCloneAssign {
    int a = 10;
    CloneInternalInstance internalIns=new CloneInternalInstance();
    public ObjCloneAssign(int b) {
        System.out.println("Inside parametrized constructor");
        System.out.println(a);
        this.a = b;
        System.out.println(a);
    }

    public ObjCloneAssign(ObjCloneAssign obj22) {
        System.out.println("Inside copy constructor");
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(obj22.a);
        obj22.a = 30;
        System.out.println(a);
        System.out.println(this.a);
        this.a = 40;
        System.out.println(a);
    }

    public static void main(String[] args) {
        ObjCloneAssign obj1 = new ObjCloneAssign(20);
        System.out.println("after obj1 " + obj1.a);
        ObjCloneAssign obj2 = new ObjCloneAssign(obj1);
        System.out.println("after obj2 " + obj1.a + " " + obj2.a);
        obj2.a=50;
        System.out.println("after obj2 " + obj1.a + " " + obj2.a);
        obj1.a=60;
        System.out.println("after obj2 " + obj1.a + " " + obj2.a);
        ObjCloneAssign obj3 = obj2;
        System.out.println("after obj3 " + obj1.a + " " + obj2.a + " " + obj3.a);
        obj2.a = 100;
        obj3.a = 200;
        System.out.println("after obj3 " + obj1.a + " " + obj2.a + " " + obj3.a+" : "+obj2.internalIns.a+" : "+obj3.internalIns.a);
        obj3.internalIns.a=20;
        obj2.internalIns.a=30;
        System.out.println("after obj3 " + obj1.a + " " + obj2.a + " " + obj3.a+" : "+obj2.internalIns.a+" : "+obj3.internalIns.a);

    }
}
