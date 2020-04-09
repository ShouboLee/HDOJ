package day1_1;

import java.util.Scanner;
public class HD2009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        while (in.hasNext()){
            double sum = 0;
            String str = in.nextLine();
            String[] s = str.split(" ");
            n = Integer.parseInt(s[0]);
            m = Integer.parseInt(s[1]);
            for(double x = n; m>0; x=Math.sqrt(x)){
                sum += x;
                m--;
            }
            System.out.printf("%.2f\n\n",sum);
        }
        in.close();
    }
}
