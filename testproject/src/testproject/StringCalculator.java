package testproject;
	import java.util.Scanner;
	public class StringCalculator {
		public int Add(String numbers){
			char []a=numbers.toCharArray();
			String s="";
			String b="";
			int sum=0;
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				count=0;
				s="";
				if(Character.isDigit(a[i]))
				{
					b=s;
					s+=a[i];
					for(int j=i+1;j<a.length;j++)
					{
						if(Character.isDigit(a[j]))
						{
							s+=a[j];
							count++;
							i++;
						}
						else
						{
							break;
						}
						if(count>=3)
						{
							s=b;
							break;
						}  
					}
					
						int t=1;
						for(int k=s.length()-1;k>=0;k--)
						{
							sum=sum+(s.charAt(k)-'0')*t;
							t=t*10;
						}
					
				}

			}

			return sum;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			StringCalculator s1=new StringCalculator();
			while(true) {
				System.out.println("");
				System.out.println("Enter String");
				String numbers=sc.next();
				System.out.println("Sum:"+s1.Add(numbers));
				
			}

		}

	}

