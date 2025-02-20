import java.util.Scanner;
public class Main {
    static int chocolatefeast(int n, int c, int m) {
        int choco = n/c;
        int wrap = choco;
        int newChoco = 0;

        while(wrap >= m) {
            newChoco = wrap / m;
            choco = choco + newChoco;
            wrap = (wrap % m) + newChoco;
        }
        return choco;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // total prizes
        int c = sc.nextInt(); // per choco cost
        int m = sc.nextInt(); // no of wrapper

        System.out.println(chocolatefeast(n, c, m));
    }
}        
