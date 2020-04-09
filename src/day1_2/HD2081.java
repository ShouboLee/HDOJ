package day1_2;
import java.util.Scanner;
public class HD2081 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while (n>0){
            String str = in.nextLine();
            String s = str.substring(str.length()-5);
            s = "6" + s;
            System.out.println(s);
            n--;
        }
        in.close();
    }
}
