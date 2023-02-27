
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int c = in.nextInt();

        //find largest of all
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

        /*
           int max = 0;
        if(a >b){
            max=a;
        }else{
            max=b;
        }
        if(c > max){
            max = c;
        }

         */

    // you can also use Math class
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
