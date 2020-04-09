package day1_2;
import java.util.Scanner;
public class HD1720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        while (in.hasNext()){
            String str = in.nextLine();
            String[] s = str.split(" ");
            a = Integer.valueOf(s[0],16);
            b = Integer.valueOf(s[1],16);
            System.out.println(a+b);
        }
        in.close();
    }
}
