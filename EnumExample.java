import java.util.Arrays;
import java.lang.Enum;

enum Status {
    Running, Pending, Failed, Success;
    public void displayStatus(){
        System.out.println("this is status "+this);
    }
}

enum Laptop {
    Mac(100000), Dell(75000), Hp, Asus(70000);

    // Mac,Dell,Hp,Asus;
    private int price;

    private Laptop() {
        this.price = 700;
        System.out.println("default constructor : " + this.name());
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("para constructor : " + this.name());
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

enum Operation {
    Add("+") {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    Substract("-") {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    };

    private String symbol;

    private Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public abstract int apply(int a, int b);
}
class EnumExampleExample{
    enum Nothing{
        Hai;
    }
}

public class EnumExample {
    public static void main(String args[]) {
        EnumExampleExample.Nothing ng=EnumExampleExample.Nothing.Hai;
        System.out.println(ng);
        Status s = Status.Failed;
        s.displayStatus();
        System.out.println(s + " : " + s.ordinal());
        Status[] ss = Status.values();
        System.out.println(Arrays.toString(ss));
        System.out.println(s.getClass().getName());
        System.out.println(s.getClass().getSuperclass().getSimpleName());
        Laptop hp1 = Laptop.Hp;
        hp1.setPrice(800);
        for (Laptop lp : Laptop.values()) {
            System.out.println(lp + " : " + lp.ordinal() + " : " + lp.getPrice());
        }
        for(Operation op:Operation.values()){
            System.out.println(op+" : "+op.ordinal()+" : "+op.getSymbol()+" : "+op.apply(5, 2));
        }
    }
}
