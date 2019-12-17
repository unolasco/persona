package com.senati.personas;

public class Persona {
	
	// ------------ Declaracion de los atributos ---------- //
	public String dni;
	public String nombre;
	public String apellido;
	public char sexo;
	public int edad;
	
	// ------------- Declaración de los constructores --------//
	public Persona(String dni, String nombre, String apellido, char sexo, int edad) {
		//super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
	}



	// ------------- Declaración de los constructores --------//
	
	public Persona() {
	//	super();
	}

	// ------------ Declarar los Getters y Setters -------------------- //

	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}




	
	// ----------- Metodo toString()  ---------- //
	

	//@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad="
				+ edad + "]";
	}
	
	
	
	

}
