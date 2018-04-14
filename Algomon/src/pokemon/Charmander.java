package pokemon;

import java.util.ArrayList;

import ataque.Ataque;
import ataque.AtaqueRapido;
import ataque.Brasas;
import ataque.Fogonazo;

public class Charmander extends FireTypePokemon{

	public Charmander(){
		super();
		this.HPMax = 170;
		this.HP = this.HPMax;
		this.nombre = "charmander";
		Fogonazo unFogonazo = new Fogonazo();
		Brasas unBrasas = new Brasas();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		this.ataques = new ArrayList<Ataque>();
		this.ataques.add(unFogonazo);
		this.ataques.add(unBrasas);
		this.ataques.add(unAtaqueRapido);
	
	}

	






}



