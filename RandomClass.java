import java.util.Arrays;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random r1=new Random();
        Long l=20l;
        Random r2=new Random(l);
        int num1 =r2.nextInt(50);
        int num2=r2.nextInt(51);
        int num3=r1.nextInt();
        int num4=r1.nextInt(40,51);
        System.out.println(num1+" : "+num2+" : "+num3+" : "+num4);

        Random random=new Random();
        boolean boolValue = random.nextBoolean();
        System.out.println("Random Boolean Value: " + boolValue);
        byte[] byteArray = new byte[5];
        random.nextBytes(byteArray);
        System.out.println("Random Bytes: " + Arrays.toString(byteArray));
        double doubleValue = random.nextDouble();
        System.out.println("Random Double Value: " + doubleValue);
        float floatValue = random.nextFloat();
        System.out.println("Random Float Value: " + floatValue);
        double gaussianValue = random.nextGaussian();
        System.out.println("Random Gaussian Value: " + gaussianValue);
        long longValue = random.nextLong();
        System.out.println("Random Long Value: " + longValue);
        double a=random.nextGaussian(2, 4);
        System.out.println("Random Gaussian Value: " + a);
        
        random.setSeed(12345L);
        int seededValue = random.nextInt();
        System.out.println("Seeded Random Integer Value: " + seededValue);
    }
}
