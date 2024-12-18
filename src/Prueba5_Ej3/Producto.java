package Prueba5_Ej3;
import java.util.*;
public class Producto {
	
	private String nombre;
	private int stock;
	private double precio;

    //Constructor
    public Producto(String nombre, int stock, double precio) {
    	this.nombre = nombre;
    	this.stock = stock; 
        this.precio = precio;      
    }
    
    //getter setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//hashCode
	public int hashCode() {
		return Objects.hash(nombre, precio, stock);
	}

	//equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && stock == other.stock;
	}

	//toString
	public String toString() {
		return "Producto--> nombre: " + nombre + ", stock: " + stock + "uds, precio: " + precio + "€.";
	}
}
