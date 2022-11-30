package pack1.Date.Time.printing;

import java.util.Date;
import java.util.function.Supplier;

public class MainDualDate 
{
	public static void main(String[] args) 
	{
		//To Print a System Date
		Supplier<Date> sp = () -> new Date();
		System.out.println(sp.get());
		
	}

}
