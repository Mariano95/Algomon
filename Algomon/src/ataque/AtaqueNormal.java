package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public class AtaqueNormal extends Ataque{
	
	protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		return objetivo.recibirAtaqueNormal(this);
	}

}
