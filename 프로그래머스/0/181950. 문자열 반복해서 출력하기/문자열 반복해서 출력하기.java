import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        //방법1.
        // for(int i=0; i<n; i++) System.out.print(str);
        
        //방법2.
        // System.out.print(str.repeat(n));
        
        //방법3.
        StringBuilder ex = new StringBuilder();
        for(int i=0; i<n; i++) ex.append(str);
        System.out.print(ex);
            
    
    }
}