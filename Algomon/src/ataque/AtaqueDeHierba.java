package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueDeHierba extends Ataque {

	protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		return objetivo.recibirAtaqueDeHierba(this);
	}

}
