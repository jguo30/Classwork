public class RecursionDemo{

  public static void makeWords(int size, String ans){
    if(size > 0){
      for(char c = 'a'; c <= 'z'; c++){
        makeWords(size - 1, ans + c);
      }
    }
    else{
      System.out.println(ans);
    }
  }

  public static void main(String  args[]){
    makeWords(8, "");
  }
}
