package pokemon;

import java.util.ArrayList;

import ataque.Ataque;
import ataque.AtaqueRapido;
import ataque.Burbuja;
import ataque.Canto;

public class Jigglypuff extends NormalTypePokemon {

	public Jigglypuff(){
		super();
		this.HPMax = 130;
		this.HP = this.HPMax;
		this.nombre = "jigglypuff";
		Canto unCanto = new Canto();
		Burbuja unBurbuja = new Burbuja();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		this.ataques = new ArrayList<Ataque>();
		this.ataques.add(unCanto);
		this.ataques.add(unBurbuja);
		this.ataques.add(unAtaqueRapido);
	}
}
