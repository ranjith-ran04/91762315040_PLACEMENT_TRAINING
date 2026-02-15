package l2.patterns;
public class Pattern18 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++){
            char ch = (char)('A' + n - i);
            for(int j=1;j<=i;j++){
                System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}