public class _202 {
    public static boolean isHappy(int n) {
        return findSquare(n);
    }

    private static boolean findSquare(int n){
        int sum =0;
        int rem =0;

        if(n==1) {
            return true;
        }
        if(n==7){
            return true;
        }
        else if(n<10) {
            return false;
        }
        while(n!=0){
            rem = n%10 ;
            sum += rem * rem ;
            n = n/10;
        }
        return findSquare( sum );
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));

    }
}