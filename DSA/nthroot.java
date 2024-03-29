public class nthroot {

    public static void main(String args[]) {
        int n = 3, m = 27;
        getnthroot(n, m);
    }

    public static void getnthroot(int n, int m) {
        
        double low = 1;
        double high = m;
        double eps = 1e-7;

        while ((high - low) > eps) {
            
            double mid = (low+high) / 2.0;
            
            if (multiply(mid, n) < m) {
                low = mid;
            } 
            
            else {
                high = mid;
            }
        }

        System.out.println(n + "th root of " + m + " is " + low);
    }

    public static double multiply(double mid, int n) {

        double ans = 1.0;

        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
        }

        return ans;
    }
}