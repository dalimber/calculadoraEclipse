package calculadorapack;

public class testCuadrado {

	public static void main(String[] args) 
	{
		// TALLER
		//PRIMER CUADRADO
		Cuadrado c1=new Cuadrado();
		c1.lado=4;
		double areaC1=c1.calcularArea();
		System.out.println("Area cuadrado 1: "+areaC1);
		double perimetroC1=c1.calcularPerimetro();
		System.out.println("Perimetro cuadrado 1: "+perimetroC1);
		

	}

}
