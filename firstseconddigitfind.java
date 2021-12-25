package assiment3;
import java.util.Scanner;

public class firstseconddigitfind {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
        while(n!=-1) {
            int temp = n;
            int count = 0;
            while (n != 0) {
                n = n / 10;
                count++;
            }
               System.out.println(temp / ((int) (Math.pow(10, count)) / 100));
               n= sc.nextInt();
        }

    }


}
