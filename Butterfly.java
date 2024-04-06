public class Butterfly {
    public static void main(String[] args) {
        System.out.println();
        int num1=31,num11=47,j=0;
        for(int i=0;i<11;i++){
            if(i==0){System.out.print("*".repeat(num1)+" ".repeat(num11)+"*".repeat(num1)+"\n");}
            if(i==1){j+=4;num11-=2*4;System.out.print(" ".repeat(j)+"*".repeat(num1)+" ".repeat(num11)+"*".repeat(num1)+"\n");}
            if(i==2 || i==3){j+=3;num11-=2*3;System.out.print(" ".repeat(j)+"*".repeat(num1)+" ".repeat(num11)+"*".repeat(num1)+"\n");}
            if((i>=4 && i<=8)|| i==10){j+=2;num11-=2*2;System.out.print(" ".repeat(j)+"*".repeat(num1)+" ".repeat(num11)+"*".repeat(num1)+"\n");}
            if(i==9){j+=1;num11-=2*1;System.out.print(" ".repeat(j)+"*".repeat(num1)+" ".repeat(num11)+"*".repeat(num1)+"\n");}
        }
        int num2=61;
        for(int i=0;i<9;i++){
            if(i==0){j+=1;System.out.print(" ".repeat(j)+"*".repeat(num2)+"\n");}
            if((i>=1 && i<=5)|| i==8){j+=2;System.out.print(" ".repeat(j)+"*".repeat(num2=num2-(2*2))+"\n");}
            if(i>=6 && i<=7){j+=3;System.out.print(" ".repeat(j)+"*".repeat(num2=num2-(2*3))+"\n");}
        }
        for(int i=1;i<=3;i++){
            if(i==1){j-=2;num2+=4;System.out.println(" ".repeat(j)+"*".repeat(num2));j-=1;num2+=2;}
            else{System.out.println(" ".repeat(j)+"*".repeat(num2));}
        }
        for(int i=1;i<=3;i++){
            if(i==1){j-=1;num2+=2;System.out.println(" ".repeat(j)+"*".repeat(num2));j-=1;num2+=2;}
            else{System.out.println(" ".repeat(j)+"*".repeat(num2));}
        }
        System.out.println(j+" "+num2);
    }
}
