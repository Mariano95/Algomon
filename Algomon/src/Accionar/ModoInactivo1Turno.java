package Accionar;

import ataque.Ataque;
import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public class ModoInactivo1Turno extends Modo {
	
	private Modo siguienteModo;
	
	public ModoInactivo1Turno(){
		this.siguienteModo = new ModoNormal();
		this.nombreDelModo = "Modo Inactivo 1 Turnos";
	}

	@Override
	public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo) {
		//Aca hay que acordarnos de poner el Mensaje de Dormido en el Layout
		return 0;
	}
	
	public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException{
		unPokemon.decrementarHP(cantidadHP);
		if (unPokemon.getHP() <= 0){
			throw new PokemonSeDebilitoException();
		}
		return cantidadHP;
	}
	
	public Modo sufrirDanioPermanente(){
		return new ModoDanioPermanenteEInactivoPor1Turno();
	}
	
	public Modo inhabilitar(){
		return new ModoInactivo3Turnos();
	}
	
	public Modo siguienteModo(){
		return this.siguienteModo;
	}

}
