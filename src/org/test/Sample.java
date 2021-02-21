package org.test;



public class Sample {
	public static void main(String[] args)  {
		String s="Surya";
		System.out.println(s.length());
		
		

		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println(s.charAt(i)+" ");
		}

		System.out.println("ji");

	}
}
