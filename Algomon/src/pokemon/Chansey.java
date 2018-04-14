package pokemon;

import java.util.ArrayList;

import ataque.Ataque;
import ataque.AtaqueRapido;
import ataque.Canto;
import ataque.LatigoCepa;

public class Chansey extends NormalTypePokemon{
	
	public Chansey(){
		super();
		this.HPMax = 130;
		this.HP = this.HPMax;
		this.nombre = "chansey";
		Canto unCanto = new Canto();
		LatigoCepa unLatigoCepa = new LatigoCepa();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		this.ataques = new ArrayList<Ataque>();
		this.ataques.add(unLatigoCepa);
		this.ataques.add(unCanto);
		this.ataques.add(unAtaqueRapido);
	
	}

}
