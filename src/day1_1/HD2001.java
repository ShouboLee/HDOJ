package day1_1;

import java.util.Scanner;

public class HD2001 {
    public static void main(String[] args) {
        int[] day={31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner in = new Scanner(System.in);
        int y,m,d;
        while (in.hasNext()){
            int num = 0;
            String str = in.nextLine();
            String[] date = str.split("/");
            y = Integer.parseInt(date[0]);
            m = Integer.parseInt(date[1]);
            d = Integer.parseInt(date[2]);
            if(y%4==0 && y%100!=0 || y%400==0)
                day[1] = 29;
            else
                day[1] = 28;
            num += d;
            for(int i=0; i<m-1; i++){
                num += day[i];
            }
            System.out.println(num);
        }
        in.close();
    }
}
