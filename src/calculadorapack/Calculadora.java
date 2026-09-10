package calculadorapack;

public class Calculadora {

	public double sumar (int a, int b)
	{
		double resultado=a+b;
		return resultado;
	}
	public int restar (int a,int b) 
	{
		int resultado=a-b;
		return resultado;
	}
	//TALLER
	//FUNCION MULTIPLICAR
	public double multiplicar (double valor1, double valor2)
	{
		double producto=valor1*valor2;
		return producto;
	}
	
	//FUNCION DIVIDIR
		public double dividir(double dividendo,double divisor)
		{
			double cociente=dividendo/divisor;
			return cociente;
		}

		//FUNCION PROMEDIAR
		public double promediar(double valor1,double valor2,double valor3)
		{
			double promedio=((valor1+valor2+valor3)/3);
			return promedio;
		}
}
	
