package week3Assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
				
		Arrays.sort(a);
		
		 int n=a.length;
	        int sum1=((n)*(n+1))/2;
	        int sum2=1;
	        for(int i=0;i<n;i++)
	          sum2+=a[i];
	        System.out.println(sum1-sum2);
		}
		}

