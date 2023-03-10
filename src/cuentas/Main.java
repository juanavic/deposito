package cuentas;
/**
 * esta clase intenta retirar e ingresar en la cuenta1
 * @author giova
 *
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = operativa_cuenta(0);
/**
 * intenta retirar e imprime fallo al retirar.
 */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
  
  /**
   * intenta ingresar e imprime fallo al ingresar.
   */
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	private static CCuenta operativa_cuenta(float cuenta) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
		return cuenta1;
	} 
}


