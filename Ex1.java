import java.util.InputMismatchException;
class Ex1
{
	public static void main(String[] args) 
	{	
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int[] x=new int[3];
		System.out.println("請輸入索引");
		
		try
		{
			int n=sc.nextInt();//new InputMismatchException();
			x[n]=10;//new ArrayIndexOutOfBoundsException();-->停止-->拋訊號
			System.out.println("請輸入分母");
			int m=sc.nextInt();


			System.out.println("x["+n+"]/"+m+"="+(x[n]/m));



		}

		
		catch(ArrayIndexOutOfBoundsException|InputMismatchException|ArithmeticException e)//java7
		{
			System.out.println("重新輸入索引需介於0~2 or 請輸入整數 or 分母不可為0");
			e.printStackTrace();
		}

		
		/*catch(ArrayIndexOutOfBoundsException e)//待命-->ArrayIndexOutOfBoundsException e=?-->捕捉訊號
		{
			System.out.println("重新輸入索引需介於0~2");
			e.printStackTrace();
		}

		catch(InputMismatchException e)
		{
			System.out.println("請輸入整數");
			e.printStackTrace();
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("分母不可為0");
			e.printStackTrace();
		}*/
		

		catch(RuntimeException e)//RuntimeException e=?
		{
			System.out.println("重新輸入");
			e.printStackTrace();
		}
		

		/*finally//java6以前
		{

			for(int i=1;i<=10;i++)
			{
				System.out.println("hello java");
			
			}
		}
		*/

		//java7以後
		for(int i=1;i<=10;i++)
			{
				System.out.println("hello java");
			}
	}
}