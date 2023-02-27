public class CountNums {
    public static void main(String[]args ){
        //int num = 5335556;
        int num=234;
        int count=0;
        while(num>0){
            int rem = num % 10;
            if(rem==5)
                count++;
            num=num/10;
        }

        System.out.println(count);
    }
}
