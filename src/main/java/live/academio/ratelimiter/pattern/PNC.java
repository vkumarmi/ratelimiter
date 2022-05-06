package live.academio.ratelimiter.pattern;

import java.util.HashSet;
import java.util.Set;

//ABC ACB BAC BCA CBA CAB-{ABC}
public class PNC {

    public static void main(String[] args) {
    String str="ABC";
    pnc(str);
    }
  public static void pnc(String str){
      int length=str.length();
      Set<String> set=new HashSet<>();
      set.add(str);
      for(int i=0;i<length;i++){
          for(int j=0;j<length;j++){
              if(i!=j){
                 set.add(swap(str,i,j));
              }
          }
      }
      set.stream().forEach(System.out::println);
  }

  private static String swap(String str,int i,int j){
        char [] charArray=str.toCharArray();
        char temp;
        temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return new String(charArray);
  }

}

//ABC
//ACB
//CBA
//BAC

