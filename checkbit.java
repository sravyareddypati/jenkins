import java.util.*;
class checkbit{
    static void myMethod(int n,int i,int k){
        if(((n>>i)&(k))==1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int k=1;

        myMethod(n,i,k);
    }
}