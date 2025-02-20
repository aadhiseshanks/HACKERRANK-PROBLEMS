import java.util.Scanner;
public class Main {
    public static int utopianTree(int n) {
        int t = 1;
        for(int i=1; i<=n; i++) {
            if((i&1)==0) t = t + 1;
            else t = t * 2;
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Tree capacity

        System.out.println(utopianTree(n));
    }
}        
