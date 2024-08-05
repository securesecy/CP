import java.util.Scanner;

public class fibonacci {

    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        int prev = fib(n-1);
        int prev2 = fib(n-2);

        return prev+prev2;


    }
    public static void main(String[] args) {
        Scanner hack = new Scanner(System.in);
        int n = hack.nextInt();
        for(int i = 0; i<=n; i++){
            System.out.println(fib(i));
        }
        

    }
    
}
