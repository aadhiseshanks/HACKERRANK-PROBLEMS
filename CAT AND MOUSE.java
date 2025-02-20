import java.util.Scanner;
public class Main {
    static String catAndMouse(int x, int y, int z) {
        int d1 = 0, d2 = 0;
        if(x<=z) d1 = z - x;
        else d1 = x - z;
        if(y<=z) d2 = z - y;
        else d2 = y - z;
        
        if(d1==d2) return "Mouse C";
        else if(d1 < d2) return "Cat A";
        else return "Cat B";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // x - Cat A
        int y  = sc.nextInt(); // y - Cat B
        int z = sc.nextInt(); // z - Mouse C

        System.out.println(catAndMouse(x, y, z));
    }
}        
