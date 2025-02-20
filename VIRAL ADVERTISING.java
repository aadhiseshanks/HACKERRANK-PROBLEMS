import java.util.Scanner;
public class Main {
    public static int viraladvertising(int n, int shared) {
        int like = 0, total = 0;
        for(int i=1; i<=n; i++) {
            like = shared/2;
            total = total + like; // total = cumulative
            shared = like * 3;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // No of Days
        int s = sc.nextInt(); // No of Shared person
 

        System.out.println(viraladvertising(n, s));
    }
}        
