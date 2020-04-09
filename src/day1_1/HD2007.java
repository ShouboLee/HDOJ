package day1_1;

import java.util.Scanner;
public class HD2007 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        while (in.hasNext()){
            int x=0,y=0;
            String str = in.nextLine();
            String[] s = str.split(" ");
            m = Integer.parseInt(s[0]);
            n = Integer.parseInt(s[1]);
            int t;
            if(m > n){
                t=m;m=n;n=t;
            }
            for(int i=m; i<=n; i++){
                if(i%2==0){
                    x += Math.pow(i,2);
                }else {
                    y += Math.pow(i,3);
                }
            }
            System.out.println(x+" "+y);
        }
        in.close();
    }
}
