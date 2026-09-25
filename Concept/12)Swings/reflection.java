//reflection
import java.lang.reflect.*;

class LoadClass
{
	public static void main(String args[])
	{
		try{
			Class 	claz = Class.forName("NotePad");

			Constructor[] constructors=claz.getConstructors();

			for(Constructor ctr : constructors)
			{
				System.out.print(ctr.getName()+"(");
				Class params[]=ctr.getParameterTypes();
				for(Class param : params)
				{
					System.out.print(param.getName()+",");
				}
				System.out.println(")");
			}

			claz.newInstance();

		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException ex)
		{
			ex.printStackTrace();
		}

	}
}
