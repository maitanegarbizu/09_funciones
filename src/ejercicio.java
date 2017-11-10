
public class ejercicio {
	
	private static void escribir_array(int[] numeros) {

	}
	
	static int max(int[] numeros){
		
		int  maximo = 0;
		for(int i = 0; i < numeros.length; i++){
			maximo = maximo + numeros [i];
		}
		
		return 
		
	}

	static int min(int[] numeros){
		
		int minimo = 0;
		for(int i = 0; i < numeros.length; i++){
			minimo = minimo + numeros [i];
		}
		
		return
	}

	static double  media(int[] numeros){
		
		int suma = 0;
		for(int i = 0; i < numeros.length; i++){
			suma = suma + numeros[i];
		}
		
		return suma/numeros.length;
	}
	
	private static double aumento(double salario, double porcentaje) {
		
		return 0;
	}

	public static void main(String[] args) {
		
		int[] numeros = { 12, 4, 4, 7, 3, 6, 3 };
		
	System.out.println(max(numeros));
	
	int max = max(numeros);
	
	System.out.println(min(numeros));
	
	int min = min(numeros);
	
	System.out.println(media(numeros));
	
	double media = media(numeros);
	
	double salario = 1000.4;
	double porcentaje = 1.5;
	
	double nuevo_salario = aumento(salario, porcentaje);

	}

	

}

	


