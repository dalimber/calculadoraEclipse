package calculadorapack;

public class testRectangulo {

	public static void main(String[] args) 
	{
		// RECTANGULO 1
		Rectangulo r1=new Rectangulo();
		r1.altura=2;
		r1.base=4;
		int resultadoArea=r1.calcularArea();
		System.out.println("Resultado area: "+resultadoArea);
		
		//RECTANGULO 2
		Rectangulo r2=new Rectangulo();
		r2.altura=8;
		r2.base=2;
		int resultadoArea2=r2.calcularArea();
		System.out.println("Resultado area r2: "+resultadoArea2);
		
		//TALLER
		//RECTANGULO 1
		double resultadoPerimetro=r1.calcularPerimetro();
		System.out.println("Perimetro r1: "+resultadoPerimetro);
		//RECTANGULO 2
		double resultadoPerimetroR2=r2.calcularPerimetro();
		System.out.println("Perimetro r2: "+resultadoPerimetroR2);

	}

}
