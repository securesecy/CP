import java.util.Scanner;

public class factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int ans = n * fact((n-1));
        return ans;
    }
    public static void main(String[] args) {
        Scanner hack = new Scanner(System.in);
        int n = hack.nextInt();
        System.out.println(fact(n));
    }
}
