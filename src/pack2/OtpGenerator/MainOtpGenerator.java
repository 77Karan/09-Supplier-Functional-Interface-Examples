package pack2.OtpGenerator;

import java.util.function.Supplier;

public class MainOtpGenerator 
{
	public static void main(String[] args)
	{
		Supplier<String> sp = () -> {
			String otp=" ";

			for(int i=1;i<=6;i++)
			{
				otp=otp+(int) (Math.random()*10);
			}
			return otp;
			
		};
		
		System.out.println(sp.get());
		System.out.println(sp.get());
		
	}

}
