package cajas;

import entrenador.Entrenador;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import pokemon.Pokemon;

//--------------------------------------------------
public class CajaHorizontalDeEleccionDeAlgomones {
	
	private HBox cajaHorizontal;
	private Pokemon pokemon1;
	private Pokemon pokemon2;
	private Pokemon pokemon3;
	private Entrenador entrenador;
	//--------------------------------------------------
	public CajaHorizontalDeEleccionDeAlgomones(Pokemon unPokemon1, Pokemon unPokemon2, Pokemon unPokemon3, Entrenador unEntrenador){
		
		this.pokemon1 = unPokemon1;
		this.pokemon2 = unPokemon2;
		this.pokemon3 = unPokemon3;
		this.entrenador = unEntrenador;
		this.inicializarCaja();
	}
	//--------------------------------------------------
	protected void inicializarCaja(){
		
		this.cajaHorizontal = new HBox(10);
		this.cajaHorizontal.setAlignment(Pos.CENTER);
		
		CajaAlgomon CajaAlgomon1 = new CajaAlgomon(this.pokemon1, this.entrenador);
		CajaAlgomon CajaAlgomon2 = new CajaAlgomon(this.pokemon2, this.entrenador);
		CajaAlgomon CajaAlgomon3 = new CajaAlgomon(this.pokemon3, this.entrenador);
		
		this.cajaHorizontal.getChildren().addAll(CajaAlgomon1.getCaja(), CajaAlgomon2.getCaja(), CajaAlgomon3.getCaja());
		
	}
	//--------------------------------------------------
	public HBox getCaja(){
		
		return this.cajaHorizontal;
	}
	//--------------------------------------------------
}
