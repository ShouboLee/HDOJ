package day1_1;

import java.util.Scanner;
public class HD2008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a=0,b=0,c=0;
            int n;
            float x;
            String str = in.nextLine();
            String[] s = str.split(" ");
            n = Integer.parseInt(s[0]);
            if(n == 0)
                continue;
            for(int i=1; i<=n; i++){
                x = Float.parseFloat(s[i]);
                if(x<0)
                    a++;
                else if (x==0)
                    b++;
                else
                    c++;
            }
            System.out.println(a+" "+b+" "+c);
        }
        in.close();
    }
}
