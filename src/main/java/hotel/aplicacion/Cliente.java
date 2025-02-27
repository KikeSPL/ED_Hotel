/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.aplicacion;

/**
 * Representa un cliente del hotel. 
 * Esta clase almacena informacion básica del cliente como su nombre, dni y telefono.
 * 
 * @author Enrique Sainz-Pardo Lopez
 */
public class Cliente {
    private static int contadorClientes = 0;
    private int codigo;
    private String nombre;
    private String dni;
    private String telefono;

    /**
     *      
     * @param nombre Nombre completo del cliente
     * @param dni Dni del cliente
     * @param telefono Telefono del cliente
     * @throws Exception Excepcion que controla que sólo se crea el cliente si el dni es correcto
     */
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.setNombre(nombre);
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setCodigo(obtenerNumeroCliente());
    }
    	/**
    	 * 
    	 * @return Devuelve el contador de cliente previo su incremento
    	 */
        private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }

    /**
     * 
     * @return Devuelve la información del cliente (codigo, nombre, dni y telefono)
     */
    public String mostrarInformacion() {
        return "Código: " + getCodigo() + ", Nombre: " + getNombre() + ", DNI: " + getDni() + ", Teléfono: " + getTelefono();
    }

	private String getTelefono() {
		return telefono;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	private String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
