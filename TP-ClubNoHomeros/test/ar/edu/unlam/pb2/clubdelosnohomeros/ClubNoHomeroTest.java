package ar.edu.unlam.pb2.clubdelosnohomeros;

import org.junit.Assert;
import org.junit.Test;

public class ClubNoHomeroTest {
	
	@Test
	public void queSeAbraElBarSinClientes(){
		ClubNoHomero miClub = new ClubNoHomero();
		
		Integer valorEsperado = 0;
		Integer valorActual = miClub.getClientes().size();
	
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void queIngreseClientesSinDuplicar(){

		ClubNoHomero miClub = new ClubNoHomero();
		
		Persona Marcela = new Persona ("Marcela",18);
		Persona Alberto = new Persona ("Alberto",43);
		Persona Ruperto = new Persona ("Ruperto",21);
		Persona Homero = new Persona ("Homero",32);
		Persona otroHomero = new Persona ("Homero",32);
		Persona Zulma = new Persona ("Zulma",51);
		Persona Samuel = new Persona ("Samuel",41);
		Persona otroSamuel = new Persona ("Samuel",41);
		
		miClub.ingresaCliente(Marcela);
		miClub.ingresaCliente(Alberto);
		miClub.ingresaCliente(Ruperto);
		miClub.ingresaCliente(Homero);
		miClub.ingresaCliente(otroHomero);
		miClub.ingresaCliente(Zulma);
		miClub.ingresaCliente(Samuel);
		miClub.ingresaCliente(otroSamuel);
		
		Integer cantidadClientesEsperados = 6; 
		Integer cantidadClientesActuales = miClub.getClientes().size();
		
		Assert.assertEquals(cantidadClientesEsperados, cantidadClientesActuales);

	}
	
	@Test
	public void queEstenOrdenadosPorNombre(){

		ClubNoHomero miClub = new ClubNoHomero();
		
		Persona Marcela = new Persona ("Marcela",18);
		Persona Alberto = new Persona ("Alberto",43);
		Persona Ruperto = new Persona ("Ruperto",21);
		Persona Homero = new Persona ("Homero",32);
		Persona Zulma = new Persona ("Zulma",51);
		Persona Samuel = new Persona ("Samuel",41);
		
		miClub.ingresaCliente(Marcela);
		miClub.ingresaCliente(Alberto);
		miClub.ingresaCliente(Ruperto);
		miClub.ingresaCliente(Homero);
		miClub.ingresaCliente(Zulma);
		miClub.ingresaCliente(Samuel);
		
		String primerNombreEsperado = "Alberto";
		String ultimoNombreEsperado = "Zulma";
		
		Persona primerNombreActual = miClub.getClientes().first();
		Persona ultimoNombreActual = miClub.getClientes().last();
		
		Assert.assertEquals(primerNombreEsperado, primerNombreActual.getNombre());
		Assert.assertEquals(ultimoNombreEsperado, ultimoNombreActual.getNombre());

	}
	
	@Test
	public void queEstenOrdenadosPorEdad(){
		ClubNoHomero miClub = new ClubNoHomero(new Comparador());
		
		Persona Marcela = new Persona ("Marcela",18);	
		Persona Alberto = new Persona ("Alberto",43);
		Persona Ruperto = new Persona ("Ruperto",21);
		Persona Homero = new Persona ("Homero",32);
		Persona otroHomero = new Persona ("Homero",32);
		Persona Zulma = new Persona ("Zulma",51);
		Persona Samuel = new Persona ("Samuel",41);
		Persona otroSamuel = new Persona ("Samuel",41);
		
		miClub.ingresaCliente(Marcela);
		miClub.ingresaCliente(Alberto);
		miClub.ingresaCliente(Ruperto);
		miClub.ingresaCliente(Homero);
		miClub.ingresaCliente(otroHomero);
		miClub.ingresaCliente(Zulma);
		miClub.ingresaCliente(Samuel);
		miClub.ingresaCliente(otroSamuel);
		
		Integer primerEdadEsperada = 18;
		Integer ultimaEdadEsperada = 51;
		
		Persona primerEdadActual = miClub.getClientes().first();
		Persona ultimaEdadActual = miClub.getClientes().last();
		
		Assert.assertEquals(primerEdadEsperada, primerEdadActual.getEdad());
		Assert.assertEquals(ultimaEdadEsperada, ultimaEdadActual.getEdad());

	}
	

}
