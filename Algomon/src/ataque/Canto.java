package ataque;

import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public class Canto extends AtaqueNormal{
	
	public Canto(){
		this.potencia = 0;
		this.cantidad = 6;
		this.nombre = "Canto";
	}
	
	protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException{
		return objetivo.recibirAtaqueCanto();
	}




}
