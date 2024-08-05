import java.util.Scanner;

public class decreasingNumber {
    public static void dI(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        dI(n-1);
    }
    public static void main(String[] args) {
        Scanner hack = new Scanner(System.in);
        int n = hack.nextInt();
        dI(n);
    }
    
}
