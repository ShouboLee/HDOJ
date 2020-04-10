package day1_2;
import java.util.Scanner;
public class HD2091 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String[] str = s.split(" ");
            if(str[0].equals("@")){
                break;
            }
            String ch = str[0];
            int n = Integer.parseInt(str[1]);
            for (int i=1; i<n; i++){
                for (int col=1; col<=n-i;col++)
                    System.out.print(" ");
                System.out.print(ch);
                for (int col=1; col<=2*i-3;col++)
                    System.out.print(" ");
                if (i != 1)
                    System.out.print(ch);
                System.out.println();
            }
            for (int j = 1; j <= 2*n-1; j++)
                System.out.print(ch);
            System.out.println();
        }
        in.close();
    }
}
