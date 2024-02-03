class CovarientParent {
    CovarientParent() {
        System.out.println("this is parent constructor");
    }

    public static CovarientParent getReturnSta() {
        CovarientParent t = new CovarientParent();
        System.out.println("this returns parent object static");
        return t;
    }

    public CovarientParent getReturnInstance() {
        System.out.println("this returns parent object");
        return this;
    }

    public void getInsOverride() {
        System.out.println("this is instance override parrrent");
    }
}

class CovarientChild extends CovarientParent {
    private CovarientChild() {
        System.out.println("this is child constructor");
    }

    
    public static CovarientChild getReturnSta() {
        CovarientChild s = new CovarientChild();
        System.out.println("this returns child object static");
        return s;
    }

    @Override
    public CovarientChild getReturnInstance() {
        System.out.println("this returns child object");
        return this;
    }

    public void getInsOverride() {
        System.out.println("this is instance override child");
    }
}

public class CovarientType {
    public static void main(String[] args) {
        // new CovarientParent().getReturnInstance().getInsOverride();
        // new CovarientChild().getReturnInstance().getInsOverride();
        CovarientParent.getReturnSta().getInsOverride();
        CovarientChild.getReturnSta().getInsOverride();
    }
}
