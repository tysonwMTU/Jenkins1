public class Hello{
  public static void main(String[] args){
    System.out.println("About to crash...");
    String s = null;
    System.out.println(s.length());
  }
}
