package model;

import Exceptions.ContraseniaInvalidaException;
import Exceptions.NombreInvalidoException;

public class Main {

	public static void main(String[] args) {
		try {
			Usuario u1 = new Usuario("","1i222555");
		} catch (NombreInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (ContraseniaInvalidaException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
