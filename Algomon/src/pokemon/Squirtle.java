package pokemon;

import java.util.ArrayList;

import ataque.Ataque;
import ataque.AtaqueRapido;
import ataque.Burbuja;
import ataque.CanionDeAgua;

public class Squirtle extends WaterTypePokemon {

	public Squirtle(){
		super();
		this.HPMax = 150;
		this.HP = this.HPMax;
		this.nombre = "squirtle";
		CanionDeAgua unCanionDeAgua = new CanionDeAgua();
		Burbuja unBurbuja = new Burbuja();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		this.ataques = new ArrayList<Ataque>();
		this.ataques.add(unCanionDeAgua);
		this.ataques.add(unBurbuja);
		this.ataques.add(unAtaqueRapido);
	}
}
