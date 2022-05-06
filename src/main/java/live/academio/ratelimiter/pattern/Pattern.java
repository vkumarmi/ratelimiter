package live.academio.ratelimiter.pattern;
//      P        (First Character Once)--- {Pattern}
//     AAA       (Second Character thrice)
//    TTTTT      (Third Character 5 times)
//   TTTTTTT            :
//  EEEEEEEEE           :
// RRRRRRRRRRR          :
//NNNNNNNNNNNNN
public class Pattern {
    public static void main(String[] args) {
        String arguments="PATTERN";
        diamondPattern(arguments);
    }
    public static void diamondPattern(String args){
        int n=args.length();
                char ch;
        for(int i=1;i<=n;i++){
            ch=args.charAt(i-1);
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=((n+i)-(n-i));k>0;k--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
