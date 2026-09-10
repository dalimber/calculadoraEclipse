package calculadorapack;

public class testSuma {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculadora c1=new Calculadora();
		
		double r1;
		r1=c1.sumar(4, 2);
		System.out.println("Resultado :"+ r1);
		
		double r2;
		r2=c1.restar(5, 3);
		System.out.println("Resultado :"+ r2);
		
		double m1;
		m1=c1.multiplicar(10, 5);
		System.out.println("Resultado multiplicacion: "+m1);
		
		double d1;
		d1=c1.dividir(10, 2);
		System.out.println("Resultado division: "+d1);
		
		double p1;
		p1=c1.promediar(10, 8, 9);
		System.out.println("Resultado promedio: "+p1);
		
		c1.mostrarResultado();
		
		Calculadora c2=new Calculadora();
		double resultadoresta=c2.restar(100.5, 40.5);
		System.out.println("Resultado:"+ resultadoresta);
		double resultadodesc=c2.calcularDescuento(200, 15);
		System.out.println("Resultado descuento:"+ resultadodesc);
		
	}

}
