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
		
		//SEGUNDO CUADRADO
		Cuadrado c2=new Cuadrado();
		c2.lado=3;
		double areaC2=c2.calcularArea();
		System.out.println("Area cuadrado 2:"+areaC2);
		double perimetroC2=c2.calcularPerimetro();
		System.out.println("Perimetro cuadrado 2: "+perimetroC2);
		
		//TERCER CUADRADO
		Cuadrado c3=new Cuadrado();
		c3.lado=6;
		double areaC3=c3.calcularArea();
		System.out.println("Area cuadrado 3:"+areaC3);
		double perimetroC3=c3.calcularPerimetro();
		System.out.println("Perimetro cuadrado 3: "+perimetroC3);

	}

}
