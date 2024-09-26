class ConversorDatos{
	public static void main(String[] args){
		String nombre = "Valeria Camacho Hernández";
		int edad = 18;
		byte peso = 75;
		float estatura = 1.60f;
		final String gusto = "Amarillo";
		
		//Convertir mi edad a días
		int días = 365 * edad;
		
		//Convertir mi estatura a pies (feets)
		double pies = 3.28084 * estatura;
		
		//Convertir mi peso a libras (pounds)
		float libras = 2.20462f * peso;
		
		//Mostrar en terminal
		System.out.println("Mi edad en años es: "+días);
		System.out.println("Mi estatura en pies es: "+pies);
		System.out.println("Mi peso en libras (pounds) es: "+libras);
		System.out.println("Mi colo favorito es: "+gusto);
	}
}
