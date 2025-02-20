import java.util.Scanner;
public class Main {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        int newX1 = x1, newX2 = x2;
        if(v1 < v2) {
            return "NO";
        }
        
        while(newX1 < newX2) {
            newX1 = newX1 + v1;
            newX2 = newX2 + v2;
            if(newX1 == newX2) {
                return "YES";
            }
        }
        return "NO";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(); // x1 - Ist Kangaroo
        int v1  = sc.nextInt(); // v1 - Distance
        int x2 = sc.nextInt(); // x2 - 2nd Kangaroo
        int v2 = sc.nextInt(); // v2 - Distance 

        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}        
