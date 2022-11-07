import java.util.*;
class sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int z=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==0)
                z++;
        }
        for(int i=0;i<z;i++)
            b[i]=0;
        for(int i=z;i<n;i++)
            b[i]=1;
        for(int t:b){
            System.out.print(t+" ");
        }
    }
}