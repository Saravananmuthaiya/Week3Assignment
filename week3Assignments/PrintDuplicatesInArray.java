package week3Assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int a[]={14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=a.length;
		for (int i=0;i<count;i++)
		{
		for (int j=i+1;j<count;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("Duplicate Values are:" + a[i]);
				break;
			}
		}
		}

	}

}
