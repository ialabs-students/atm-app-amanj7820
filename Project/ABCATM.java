package Project;

import java.util.*;

public class ABCATM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to deposit or withdrawn Process:");
		int hd=sc.nextInt();
		for(int i=1;i<=hd;i++) {
		System.out.println("Deposit"+i+":");
		System.out.println("2000s:");
		int a=sc.nextInt();
		System.out.println("500s:");
		int b=sc.nextInt();
		System.out.println("200s:");
		int c=sc.nextInt();
		System.out.println("100s:");
		int d=sc.nextInt();
		int sum=0;
		int sum1=0;
		int e=a*2000;
		int f=b*500;
		int g=c*200;
		int h=d*100;
		sum=e+f+g+h;
		if((a<0)||(b<0)||(c<0)||(d<0) ){
			System.out.println("Incorrect Deposit amount");
			System.exit(0);
			
		}
		else if((a==0)||(b==0)||(c==0)||(d==0) ){
			System.out.println("Deposit amount cannot be zero");
			System.exit(0);
			
		}
		else {
//			a=a*2000;
//			b=b*500;
//			c=c*200;
//			d=d*100;
//			sum=a+b+c+d;
			
			System.out.println("Balance: "+sum);
		}
		System.out.println("WithDraw "+i+" ");
		System.out.println("Enter the withraw amount");
		int w=sc.nextInt();
		if((w<=0)||(w>sum)) {
			
			System.out.println("Incorrect or insufficient funds");
			
		}
		else if(w<=sum){
			System.out.println("Dispensed:");
			int count1=0;
			int count2=0;
			int count3=0;
			int count4=0;
			while(w!=0) {
			if(w>2000) {
				w=w-2000;
				count1++;
			System.out.println("2000s:"+count1);
			}
			else if(w>=500 && w<2000) {
				w=w-500;
				count2++;
			System.out.println("500s:"+count2);
			}
			else if(w>=200 && w<500) {
				w=w-200;
				count3++;
			System.out.println("200s:"+count3);
			}
			else if(w>=100 &&w<200) {
				w=w-100;
				count4++;
			System.out.println("100s:"+count4);
			}

			}
			System.out.println("Balance:");
			a=a-count1;
			b=b-count2;
			c=c-count3;
			d=d-count4;
			System.out.println("2000s: "+a);
			System.out.println("500s: "+b);
			System.out.println("200s: "+c);
			System.out.println("100s: "+d);
			a=a*2000;
			b=b*500;
			c=c*200;
			d=d*100;
			sum1=a+b+c+d;
			System.out.println("Total:"+(sum1-w));
			
			
			
		}
	
		
		}
		

	}

}
