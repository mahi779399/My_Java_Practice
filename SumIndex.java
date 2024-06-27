public class SumIndex{
    public static void main(String[] args){
        int[] arr={23,45,64,3,48,90,78,27,2};
        int sum=81;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}