package day1_1;

import java.util.Scanner;
public class HD2010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m,n;
        while (in.hasNext()){
            String str = in.nextLine(), string = "";
            String[] s = str.split(" ");
            m = Integer.parseInt(s[0]);
            n = Integer.parseInt(s[1]);
            for(int i=m; i<=n; i++){
                if(isHua(i)) {
                    string += Integer.toString(i);
                    string += " ";
                }
            }
            if (string.length() == 0)
                System.out.println("no");
            else {
                string = string.substring(0,string.length()-1);
                System.out.println(string);
            }
        }
        in.close();
    }
    static boolean isHua(int x){
        int t = x, sum=0;
        while (t>0){
            sum += Math.pow((t%10),3);
            t /= 10;
        }
        if(sum == x)
            return true;
        else
            return false;
    }
}
