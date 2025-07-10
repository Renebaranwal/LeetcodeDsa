public class factorial {
    public static int calfactorial(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        int fac = calfactorial(n - 1);
        int fact = n * fac;
        return fact;

    }
    public static void main(String args[])
    {
        int n = 5;
        int ans = calfactorial(n);
        System.out.println(ans);
    }
}