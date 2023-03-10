package cuentas;
/**
 * esta clase nos permite definir el estado de la cuenta
 * @author giova
 * ingresando y retirando dinero.
 */
public class CCuenta {
 //atribito
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
//constructor
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
//metodos
    public double estado()
    {
        return getSaldo();
    }
/**
 * metodo que permite ingresar dinero
 * @param cantidad siempre tiene que ser superior a o
 * @throws Exception no se puede ingresar cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

 /**
  * metodo que me permite retirar dinero
  * @param cantidad tiene que ser superior a 0
  * @throws Exception no se puede retirar cantidad negativa ni inferior al saldo
  */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

}
