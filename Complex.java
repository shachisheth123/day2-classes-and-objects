public class Complex
{


	public static void main(String[] args)

	{

		ComplexNumbers complex=new ComplexNumbers();
		ComplexNumbers complex1=new ComplexNumbers();		
		complex.set(3.5,4.5);
		complex1.set(4.5,5.5);
		complex.displaycomplexNumbers();
		complex1.displaycomplexNumbers();
		

		ComplexNumbers c;
		c=complex.sum(complex1);
		
		c.displaycomplexNumbers();	

	}



}