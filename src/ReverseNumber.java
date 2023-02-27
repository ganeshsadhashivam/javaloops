public class ReverseNumber {
    public static void main(String[] args){

        int num=2345;
        //approach mine
        /*
         while(num>0){
            int lastDigit = num%10;
            System.out.print(lastDigit + " ");
            num = num/10;

         */


            int ans=0;
            while(num>0){
                int rem = num %10;
                num/=10;

                ans = ans*10+rem;
            }

            System.out.println(ans);
        //}

    }
}
