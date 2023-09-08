package week3Assignments;

public class ChangeOddIndexToUpperCase {

	 public static void main(String[] args) {
	      String sc = "changeme";
	      char[] ch = sc.toCharArray();
	      System.out.println(new String(ch));
	      for(int i=0; i<ch.length; i=i+2){
	         ch[i] = Character.toUpperCase(ch[i]);
	      }
	      System.out.println(new String(ch));
	   }

}
