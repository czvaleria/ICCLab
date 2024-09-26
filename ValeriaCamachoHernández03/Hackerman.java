class Hackerman {
	public static void main(String[] args){
		
		int multiplicando = 2, condición = 4;
		double multi = 3;
		while (condición != 0){
		multi *= multiplicando;
		--condición;		
		}
		
		System.out.println("Respuesta = " +multi);
	
		System.out.println("Tenemos que x = 3, y = 4 y r = 1. Luego se abre un while, que mientras y = 0, repetirá y veces la multiplicación de r * x, el resultado se almacenará en r y por cada multiplicación que se realice, se le respatá 1 a y hasta que sea 0, pues ahí acaba. Esto se ve de la siguiente manera: y = 4 = 1*3 = 3; y = 3 = 3*3 = 9; y = 2 = 9*3 = 27; y = 1 = 27*3 = 81; y = 0 = fin. Esto es lo que hace el código. Luego x cambió a 'multiplicando', y a 'condición', y r a 'multi'.");
		
	}
}
