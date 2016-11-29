package ar.edu.unlam.pb2.clubdelosnohomeros;

import java.util.Comparator;

public class Comparador implements Comparator<Persona>{
	
	@Override
	public int compare(Persona cliente1, Persona cliente2){ 
		return cliente1.getEdad().compareTo(cliente2.getEdad());
	}

}
