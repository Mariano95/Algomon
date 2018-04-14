package Accionar;

import ataque.Ataque;
import excepciones.PokemonPropioSeDebilitoException;
import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public interface Accionable {
	
	public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo) throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException;

	public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException;

	public Accionable siguienteModo();

}
