import java.util.Scanner;

public class increasingNumber {
    public static void pI(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        pI(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner hack = new Scanner(System.in);
        int n = hack.nextInt();
        pI(n);
    }
}
