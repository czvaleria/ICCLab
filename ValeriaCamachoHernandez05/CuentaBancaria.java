import java.util.Scanner;

public class CuentaBancaria {
    /**
     * Atributos del objeto cuenta.
     */
    String nombre, cuenta, direccion, nacimiento;
    int telefono;
    double saldo;

    /**
     * Método para inicializar una cuenta bancaria con un saldo definido.
     * Esto permitirá que cada vez que se seleccione la opción crear cuenta y luego la opción de retirar dinero, depositar y conocer el saldo de la cuenta, se inicié con el valor del saldo definido (pues solo estamos trabajando con una sola cuenta) y no se trabaje con la cantidad anterior.
     */

    public CuentaBancaria() {
        saldo = 36901.56; 
    }

    /**
     * Método para crear una cuenta bancaria.
     * @param nombre      El nombre del cliente.
     * @param cuenta      Es el número de cuenta del cliente.
     * @param direccion   Es la dirección del cliente.
     * @param nacimento   Es la fecha de nacimento del cliente.
     * @param telefono    Es el número de telefono del cliente para contactarlo.
     */
    public void crearCuenta(String nombre, String cuenta, String direccion, String nacimiento, int telefono){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.direccion = direccion;
        this.nacimiento = nacimiento; 
        this.telefono = telefono; 
    }//Fin de CrearCuenta

    /**
     * Método para retirar dinero (siempre que haya saldo suficiente).
     */
    public void retirar(double cantidadR){
        if (cantidadR > saldo) {
            System.out.println("No tiene saldo suficiente.");
        } else {
            saldo -= cantidadR;
            System.out.println("Retiro exitoso. Ahora su saldo es de: $" + saldo + " pesos.");
        } 
    }//Fin de retirar
    
    /**
     * Método para depositar dinero en la cuenta.
     */
    public void depositar(double cantidadD){
        if (cantidadD > saldo) {
            System.out.println("No tiene saldo suficiente para depositar a otra cuenta.");
        } else {
            saldo += cantidadD;
            System.out.println("Depósito exitoso. Ahora su saldo es de: $" + saldo + " pesos.");
        } 
    }//Fin de depositar

    /**
     * Método para conocer el saldo de una cuenta.
     */
    public void saberSaldo(){
        System.out.println("Usted tiene un saldo actual de: $" + saldo + " pesos.");
    }

    /**
     * Método principal
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        CuentaBancaria cuentaBancaria = null;

        //Bienvenida al programa
        System.out.println("BANCO DE DINERO");
        System.out.println(" ");

        //Mostrarle al usuario las operaciones que puede realizar 
        System.out.println("Las operaciones que puede realizar son las siguientes:");
        System.out.println("1. Crear una cuenta bancaria.");
        System.out.println("2. Retirar dinero de su cuenta.");
        System.out.println("3. Depositar dinero a una cuenta.");
        System.out.println("4. Saber el saldo de su cuenta.");
        System.out.println("5. Salir.");

        System.out.println(" "); 

        while (true) {
            System.out.println("Ingrese el número de opción que desea realizar:");
            int opcion = entrada.nextInt();
            System.out.println(" ");

            if (opcion == 5) {
                System.out.println("Seleccionó 5. Salir. Hasta luego.");
                break;
            }

            switch (opcion) {
                case 1:
                    // Crear una nueva cuenta
                    System.out.println("Seleccionó 1. Crear una cuenta bancaria. Para ello debe responder lo siguiente.");
                    System.out.println(" ");
                    System.out.println("Ingrese su nombre completo:");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese fecha de nacimiento:");
                    String nacimiento = entrada.nextLine();
                    System.out.println("Ingrese su dirección completa:");
                    String direccion = entrada.nextLine();
                    System.out.println("Ingrese su número de teléfono:");
                    int telefono = entrada.nextInt();
                    // Crear el objeto cuenta con los datos proporcionados
                    cuentaBancaria = new CuentaBancaria();
                    cuentaBancaria.crearCuenta(nombre, "123456", direccion, nacimiento, telefono);
                    System.out.println(" ");
                    System.out.println("Listo. Se ha creado una cuenta de " + nombre + ", con fecha de nacimiento de " + nacimiento + ", con residencia en " + direccion + " y como medio de contacto el número de teléfono " + telefono + ". Su número de cuenta es 123456. Bienvenido/a a Banco De Dinero.");
                    System.out.println(" ");
                    break;
                
                case 2: 
                    if (cuentaBancaria == null) {
                        System.out.println("Primero debe crear una cuenta bancaria.");
                        break; 
                    }
                    System.out.println("Seleccionó 2. Retirar dinero de su cuenta.");
                    System.out.println(" ");
                    System.out.println("Ingrese la cantidad que desea retirar:");
                    double cantidadR = entrada.nextDouble(); 
                    cuentaBancaria.retirar(cantidadR);
                    System.out.println(" ");
                    break;//Este es del case 2

                case 3:
                if (cuentaBancaria == null) {
                    System.out.println("Primero debe crear una cuenta bancaria.");
                    break; 
                }
                System.out.println("Seleccionó 3. Depositar dinero a una cuenta. ");
                System.out.println(" ");
                System.out.println("Ingrese la cantidad que desea depositar:");
                double cantidadD = entrada.nextDouble(); 
                cuentaBancaria.depositar(cantidadD);
                System.out.println(" ");
                break;//Este es del case 3

                case 4:
                    if (cuentaBancaria == null) {
                        System.out.println("Primero debe crear una cuenta bancaria.");
                        break;
                    }    
                    System.out.println("Seleccionó 4. Saber el saldo de su cuenta. ");
                    System.out.println(" ");
                    cuentaBancaria.saberSaldo();                    
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("La opción que ingresaste no es válida. Inténtelo de nuevo.");
                    break;
            }//Fin de switch
        }//Fin de while
    }//Fin de main
}//Fin de CuentaBancaria
