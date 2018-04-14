package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class AtaqueDeAgua extends Ataque {
	
	protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		return objetivo.recibirAtaqueDeAgua(this);
	}
}
