package javapractice.package03;

import javapractice.PackageOuter;

public class PackageInner {
    public static void main(String[] args) {
        System.out.println("this is main");
        PackageOuter obj1 = new PackageOuter();
        obj1.outerInstance();
    }
}
