public class Counter {
    private int count;         
    private static int totalCount; //remove static to convert into instance

    public Counter() {
        count = 0;              
    }

    public void increment() {
        count++;                
        totalCount++;           
    }

    public int getCount() {
        return count;
    }

    public static int getTotalCount() {//remove static
        return totalCount;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment(); 
        c1.increment(); 

        c2.increment();

        System.out.println("Count for c1: " + c1.getCount());
        System.out.println("Count for c2: " + c2.getCount());
        System.out.println("Total Count: " + Counter.getTotalCount()); //call by any instance object c1 or c2
    }
}
