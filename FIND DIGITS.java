import java.util.Scanner;
public class Main {
    public static int findDigits(int n) {
        int temp = n, count = 0;
        while(temp > 0){
            int rem = temp % 10;
            if(rem != 0) {
                if(n % rem == 0) {
                    count++;
                }
            }
            temp = temp / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        System.out.println(findDigits(n));
    }
}        
