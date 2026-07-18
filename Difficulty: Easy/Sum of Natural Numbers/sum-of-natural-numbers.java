import java.util.Scanner;

class GFG {
    public static int sumOfNaturals(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumOfNaturals(n - 1);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
       sumOfNaturals(n);
       System.out.println(sumOfNaturals(n));
    
}
}