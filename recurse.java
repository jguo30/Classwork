public class recurse{

  public static void main(String[] args){
    // System.out.print(fibonacci(46));
    String p = "POOP";
    System.out.println(p.substring(p.length() - 2));
    p = p.substring(p.length());
    System.out.println(p.substring(p.length() - 2));
    }

  public static
  int fibonacci(int n) {
  if(n > 1){
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  else if(n == 0){
    return 0;
  }
  else{
    return 1;
  }
}
}
