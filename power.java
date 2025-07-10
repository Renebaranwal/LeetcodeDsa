public class power {
    public static int calpow(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }
        int pow = calpow(x, n-1)
        int poww = x * pow;
        return poww;
    }
    public static void main(String args[])
    {
        int x= 2, n=5;
        int ans = calpow(x, n)
        System.out.println(ans);
    }
}