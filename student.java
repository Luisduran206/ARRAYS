import java.util.Arrays;
public class Student {

	String name;
	int ID;
	int age;
	int x;
	
	String[] objects = new String[100];
	
	public Student(){
		
	}

	//Métodos del arreglo de los enteros
		public String buscarEntero(int[]myArray, int x) {
			String newString = "";
			for(int i = 0; i < myArray.length; i++) {
				if(myArray[i] == x) {
					newString = "El número que busca está en la posición " + x;
					break;
				}else {
					continue;
				}
		    }
			return newString;
		}

		public String mostrarEnteros(int[]myArray) {
			String end = "";
			for(int x = 0; x < myArray.length; x++) {
				end += myArray[x];
			}
			return end;
		}
		
		public void moverEntero(int[]myArray, int enteroEliminado) {
			int[] newArray = new int[myArray.length-1];
			for (int i = 0; i < myArray.length-1; i++) {
	            if(myArray[i] == enteroEliminado){
	                newArray = new int[myArray.length - 1];
	                for(int posicion = 0; posicion < i; posicion++){
	                    newArray[posicion] = newArray[posicion];
	                }
	                for(int x = i; x < myArray.length - 1; x++){
	                    newArray[x] = myArray[x++];
	                }
	                break;
	            }
			}
			System.out.println("Su nuevo arreglo de enteros es: " + Arrays.toString(newArray));
		}

		//Métodos del arreglo de las cadenas
		public String buscarString(String[]myArray, String name) {
			String newString = "";
			for(int i = 0; i < myArray.length; i++) {
				if(myArray[i].equals(name)) {
					newString = "El nombre que busca está en la posición " + i;
					break;
				} else {
					continue;
				}
			}
			return newString;
		}
		
		public String mostrarString(String[] myArray) {
			String end = "";
			for(int x = 0; x < myArray.length; x++) {
				end += myArray[x];
			}
			return end;
		}
		
		public void moverString(String[]myArray, String cadenaEliminada) {
			for(int i = 0; i < myArray.length; i++) {
				if(myArray[i] == cadenaEliminada) {
					myArray[i] = "";
					for(int posicion = i; posicion < myArray.length; posicion++) {
						myArray[posicion] = myArray[posicion+1];
					}
				}
			}
			System.out.println("Su nuevo arreglo de cadenas es: " + Arrays.toString(myArray));
		}
}
