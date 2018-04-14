package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueDeFuego extends Ataque{
	
	protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		return objetivo.recibirAtaqueDeFuego(this);
	}

}
