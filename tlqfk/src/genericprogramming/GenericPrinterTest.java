package genericprogramming;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMeterial(powder);	//생성해ㅓㅅ setter로 넣어줌
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMeterial(plastic);	//생성해ㅓㅅ setter로 넣어줌
		System.out.println(plasticPrinter);
		
		powderPrinter.printing();
		plasticPrinter.printing();
		
		
	}

}
