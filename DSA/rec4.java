class rec4 {
    static int func(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        return n + func(n-1);

    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(func(n));
    }

    
}
