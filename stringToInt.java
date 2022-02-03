public class stringToInt{
  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      int i = s.length() - 1;
      int modPart = 1;
      int ans = 0;
      while(s.length() > 0){
        System.out.print(s + " adding: " + s.charAt(i));
        ans += valueOfDigit(s.charAt(i)) * modPart;
        s = s.substring(0, s.length() - 1);
        i = s.length() - 1;
        modPart = modPart * 10;
        System.out.println(", ans= " + ans);
      }
      return ans;
    }

    public static int valueOfDigit(char c){
      char[] comparables = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
      for(int i = 0; i < 10; i++){
        if(comparables[i] == c){
          return i;
        }
      }
      return 0;
    }

    public static void main(String[] args){
      // System.out.println(valueOfDigit(args[0].charAt(0)));
      System.out.println(stringToInt(args[0]));
    }
}
