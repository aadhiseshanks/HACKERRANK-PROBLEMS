import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Integer> icecreamParlor(int n, ArrayList<Integer> ar) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<ar.size()-1; i++) {
            for(int j=i+1; j<ar.size(); j++) {
                if(ar.get(i) + ar.get(j) == n) {
                    res.add(i+1);
                    res.add(j+1);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int cost = sc.nextInt(); // Costs
        ArrayList<Integer> ar = new ArrayList<Integer>(); 

        for(int i=0; i<size; i++) {
            ar.add(sc.nextInt());
        }

        System.out.println(icecreamParlor(cost, ar));
    }
}        
