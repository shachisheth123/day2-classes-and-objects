public class ComplexNumbers
{

	 double realNumbers;
	 double imaginaryNumbers;

	void set(double realNumbers , double imaginaryNumbers)
	{
	this.realNumbers=realNumbers;
	this.imaginaryNumbers=imaginaryNumbers;
	}

	void displaycomplexNumbers()
	{
	System.out.println(realNumbers +"+ i" +imaginaryNumbers);
	}

	public ComplexNumbers sum(ComplexNumbers c2)
	{

	ComplexNumbers c1=new ComplexNumbers();
	
	 c1.realNumbers=this.realNumbers+c2.realNumbers;
	 c1.imaginaryNumbers=this.imaginaryNumbers+c2.imaginaryNumbers;
	return c1;

	} 
	

}