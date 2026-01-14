public class towerOfHanoi {

    public static void towerh(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerh(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerh(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3; // You can increase this to see more steps
        towerh(n, "S", "H", "D"); // S = Source, H = Helper, D = Destination
    }
}
