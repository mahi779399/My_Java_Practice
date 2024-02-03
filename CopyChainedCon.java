class Geek {
    public String name;
    public int id;
    public int ids;
    public static int a;

    public Geek(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println(name + " : " + id + " : " + ids);
    }

    public Geek(Geek g) {
        this.name = g.name;
        this.id = g.id;
        this.ids = g.ids;
        System.out.println(name + " : " + id + " : " + ids);
    }

    public Geek() {
        id = 123;
        ids = 345;
        name = "hai";
        System.out.println("hai");
    }

}

public class CopyChainedCon {
    // public int ids;
    public static void main(String[] args) {
        Geek i = new Geek();
        Geek g = new Geek("Mahi", 192);
        g.ids = 346;
        System.out.println(g.name + " * " + g.id + " * " + g.ids);
        new Geek(g);

        System.out.println(i.ids + "^^" + Geek.a);
        // System.out.println(h.name + " * " + h.id + " * " + h.ids);
    }
}
