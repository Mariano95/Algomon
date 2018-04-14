package pokemon;

import java.util.ArrayList;

import ataque.Ataque;
import ataque.AtaqueRapido;
import ataque.Burbuja;
import ataque.Fogonazo;

public class Rattata extends NormalTypePokemon{

	public Rattata(){
		super();
		this.HPMax = 170;
		this.HP = this.HPMax;
		this.nombre = "rattata";
		Fogonazo unFogonazo = new Fogonazo();
		Burbuja unBurbuja = new Burbuja();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		this.ataques = new ArrayList<Ataque>();
		this.ataques.add(unFogonazo);
		this.ataques.add(unBurbuja);
		this.ataques.add(unAtaqueRapido);
	
	}
}

