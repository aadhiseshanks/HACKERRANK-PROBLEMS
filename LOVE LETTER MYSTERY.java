import java.util.Scanner;
public class Main {
    public static int loveLetterMystery(String s) {
        int count = 0, t = 0;
        char ch1 = ' ', ch2 = ' ';
        for(int i=0, j=s.length()-1; i<j; i++, j--) {
            ch1 = s.charAt(i);
            ch2 = s.charAt(j);
            if(ch1 > ch2) t = ch1 - ch2;
            else t = ch2 - ch1;
            count = count + t;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 

        System.out.println(loveLetterMystery(s));
    }
}        
