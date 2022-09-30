package dmdw;

import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
               for(j=1;j<=2*i;j++)
               {
                      if(j%2!=0)
                      System.out.print(j+ " ");
               }
               System.out.println();
        
        }
        }

}
