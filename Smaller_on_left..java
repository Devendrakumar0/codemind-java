import java.util.*;
class sm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int f[]=new int[n];
        f[0]=-1;
        for(int i=1;i<n;i++){
            int mn=a[i];
            for(int j=i-1;j>=0;j--){
                if(a[j]<mn){
                    mn=a[j];
                    break;
                }
            }
            if(mn==a[i])
                f[i]=-1;
            else
                f[i]=mn;
        }
        for(int t:f)
            System.out.print(t+" ");
    }
}