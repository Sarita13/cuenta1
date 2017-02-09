
package Practica4;

public class Main {

	public static void main(String[] args) {
		CCuenta cuenta1;
		double saldoActual;
		double valorActual;
		double valorAnterior;

		cuenta1 = new CCuenta("Juan Lopez", "1000-2365-85-123456789", 2500, 0);

		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es " + saldoActual);
		
		//cuenta1.setSaldo(-3);
		try {
			cuenta1.ingresar(-3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("El saldo actual es ..... " + cuenta1.getSaldo());
	}

}
