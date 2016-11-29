package ar.edu.unlam.pb2.clubdelosnohomeros;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ClubNoHomero{
	
	private TreeSet<Persona> clientes;
	private Boolean abierto;
		
	public ClubNoHomero(){
		this.clientes = new TreeSet<Persona>();
		this.abierto = true;
	}
	
	public ClubNoHomero(Comparator<Persona> comparar){
		this.clientes = new TreeSet<Persona>(comparar);
		this.abierto = true;
	}
	
	public void ingresaCliente(Persona cliente){
		this.clientes.add(cliente);
	}
	
	public TreeSet<Persona> getClientes(){
		return clientes;
	}
	
	public Boolean comparandoClientes(Persona cliente){
		abierto=false;
		Iterator<Persona> iter = clientes.iterator();
		while(iter.hasNext()){
			Persona cliente1=iter.next();
			String nombre = cliente1.getNombre();
			
			if(cliente1.getNombre().equals(nombre)){
				abierto=true;
			}else{
				abierto=false;
			}	
		}
		return abierto;
	}	

}
