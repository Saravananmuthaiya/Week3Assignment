package week3Assignments;

public class Palindrome {

	public static void main(String[] args) {
		String a="MADAM",b="";
		int strlength=a.length();
		
		for (int i=(strlength-1);i>=0;--i)
		{
			b=b+a.charAt(i);
		}
		if(a.toLowerCase().equals(b.toLowerCase()))
		{
			System.out.println(a+"is a Palindrome String.");
		}
		else
			System.out.println(a+"is a not a Palindrome String.");

	}

}
