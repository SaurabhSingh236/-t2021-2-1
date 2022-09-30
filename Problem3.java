package dmdw;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i+=2)
        {
        	int k;
            for(k=1;k<=2;k++)
            {
               for(j=1;j<=2*i;j++)
               {
                      if(j%2!=0)
                      System.out.print(j+"  ");
               }
               System.out.println();
            }
        
        }
	}

}
