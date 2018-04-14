package pokemon;

import java.util.ArrayList;

import ataque.Ataque;
import ataque.AtaqueRapido;
import ataque.Chupavidas;
import ataque.LatigoCepa;

public class Bulbasaur extends GrassTypePokemon{
	
	public Bulbasaur(){
		super();
		this.HPMax = 140;
		this.HP = this.HPMax;
		this.nombre = "bulbasaur";
		Chupavidas unChupavidas = new Chupavidas();
		LatigoCepa unLatigoCepa = new LatigoCepa();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		this.ataques = new ArrayList<Ataque>();
		this.ataques.add(unChupavidas);
		this.ataques.add(unLatigoCepa);
		this.ataques.add(unAtaqueRapido);
	}

}
