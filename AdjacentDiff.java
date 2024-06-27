public class AdjacentDiff {
    public static int[] adjacentPairDiff(int[] arr){
        int[] res=new int[arr.length-1];
        if(arr.length<2){
            res[0]=0;
            return res;
        }else{
            for(int i=0;i<arr.length-1;i++){
                res[i]=Math.abs(arr[i]-arr[i+1]);
            }
            return res;
        }
    }
    public static void main(String[] args) {
        int[] arr={23,45,6,35,78,99,48,28,36,53};
        int[] res=adjacentPairDiff(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
