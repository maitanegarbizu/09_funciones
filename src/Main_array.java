/*
 * 
 */
public class Main_array {

	public static void main(String[] args) {
		int[] nums = {4,6,2,5,1,10};
		
		System.out.println("el minimo del array es " + minimo_maximo(nums)[0]);
		System.out.println("el maximo del array es " + minimo_maximo(nums)[1]);
		
		int[] min_max;
		min_max = minimo_maximo(nums);
		System.out.println("el min es: " + min_max[0]);
		System.out.println("el max es: " + min_max[1]);
				
		int[] nums2 = {4,6,1,10};
		int maximo_nums2 = minimo_maximo(nums2)[1];
	
	}
	/*
	 * recibira un array de numemer y
	 * devolvera un array con min y max
	 * @param numeros un array de integers
	 * @return array de integers den longitud 2, en la primer indice ira el minimo y en el segundo el maximo
	 */
	static int[] minimo_maximo(int[] numeros){
		int max = numeros[0];
		int min = numeros[0];
		
		//calculara el maximo y lo guardara en max
		for(int i = 0; i< numeros.length;i++){
			if(numeros[i] > max){
				max = numeros[i];
			}
		}
		
		//calcular el minimo y lo guardara en min
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i] < min){
				min = numeros[i];
			}
		}
		
		int[] min_max = new int[2];
		min_max[0] = min;
		min_max[1] = max;
		
		//int[] min_max = {min, max};
		
		return min_max;			
	}
	
	static int[] minimo_maximo_v2(int[] numeros){
//		int[] min_max = new int[2];
//		
//		min_max[0] = minimo(numeros);
//		min_max[1] = maximo(numeros);
//		
//		return min_max;
		
		int[] min_max = {minimo(numeros), maximo(numeros)};
		return min_max;
	}
	
	static int maximo (int[] numeros){
		int max = numeros[0];
		for(int i = 0; i< numeros.length;i++){
			if(numeros[i] > max){
				max = numeros[i];
			}
		}
		return max;
	}
	
	static int minimo(int[] numeros){
		int min = numeros[0];
		for(int i = 0; i < numeros.length; i++){
			if(numeros[i] < min){
				min = numeros[i];
			}
		}
		return min;
	}
	
	
}
