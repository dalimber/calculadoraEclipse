package calculadorapack;

public class testSuma {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculadora c1=new Calculadora();
		
		double r1;
		r1=c1.sumar(4, 2);
		System.out.println("Resultado :"+ r1);
		
		int r2;
		r2=c1.restar(5, 3);
		System.out.println("Resultado :"+ r2);
		
		double m1;
		m1=c1.multiplicar(10, 5);
		System.out.println("Resultado multiplicacion: "+m1);
	}

}
