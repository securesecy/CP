import java.util.*;
public class max_SumOfWindow {

    public static void main(String[] args) {
        Scanner hack = new Scanner(System.in);
        int[] arr = {1, 5 , 8 , -4 , 8};
        System.out.print("Enter the Window Size = ");
        int k = hack.nextInt();
        int MAX_SUM = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length-k; i++){
            int sum = 0;
            for(int j = i; j < i+k; j++){
                sum += arr[j];
            }
            MAX_SUM = Math.max(MAX_SUM, sum);
            }
            System.out.println(MAX_SUM);
        }
}