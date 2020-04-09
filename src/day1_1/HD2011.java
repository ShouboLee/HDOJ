package day1_1;

import java.util.Scanner;
public class HD2011 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String str = in.nextLine();
        str = in.nextLine();
        String[] s = str.split(" ");
        for(int i=0; i<m; i++){
            double sum = 0;
            int n = Integer.parseInt(s[i]);
            for(int j=1; j<=n; j++){
                if(j%2==0)
                    sum += (-1.0/j);
                else
                    sum += (1.0/j);
            }
            System.out.printf("%.2f\n\n", sum);
        }
    }
}
