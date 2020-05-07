package model;

import Exceptions.ContraseniaInvalidaException;
import Exceptions.NombreInvalidoException;

public class Usuario {
	private String nombre, contrasenia;
	
	public Usuario(String nombre, String contrasenia) throws Exception {
		this.setNombre(nombre);
		this.setContrasenia(contrasenia);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception {
		if(nombre!=null && nombre!="")
			this.nombre = nombre;
		else
			throw new NombreInvalidoException("Nombre invalido");
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) throws Exception  {
		if((contrasenia!=null && contrasenia.length()>=6) &&
		((contrasenia.charAt(0)>='a' && contrasenia.charAt(0)<='z') || (contrasenia.charAt(0)>='A' && contrasenia.charAt(0)<='Z')))
			this.contrasenia = contrasenia;
		else
			throw new ContraseniaInvalidaException("Contrasenia invalida");
	}
	
	
	
}
