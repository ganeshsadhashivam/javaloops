import java.util.Scanner;
public class Loops {


    public static void main(String[] args){
        //instead of writing this many time we use for loop
        System.out.println("salary");

        System.out.println("salary");
        System.out.println("salary");
        System.out.println("salary");
        System.out.println("salary");
        System.out.println("salary");

        //syntax
        /*
        for(initialization;condition;increment/decrement){
         System.out.println();
           }
         */
            for(int num=1;num<=5;num++){
                System.out.println(num);
            }

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

        for(int num=1;num<=n;num++){
            System.out.println(num);
        }

        //while loops
       // when you dont know how many times our loop needs to run
        //use while loop and if u know use for loop
        int num=1;
        while(num<=5){
            System.out.println(num);
            num++;
        }


        //do while
        /*
        it will run one time atleast
        do{
        System.out.println("hello world");
        }while(condition)
         */
        int k = 1;
        do{
           System.out.println("i will run one atleast");
        }while(k != 1);
    }
}
