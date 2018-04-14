package eventos;

import cajas.CajaAlgomon;
import entrenador.Entrenador;
import excepciones.EquipoCompletoException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import pokemon.Pokemon;
//----------------------------------------------------------------------------------
public class BotonDeSelecionDePokemonEventHandler implements EventHandler<ActionEvent>{

	private CajaAlgomon cajaAlgomon;
	private Boolean presionado;
	//----------------------------------------------------------------------------------
	public BotonDeSelecionDePokemonEventHandler(CajaAlgomon unaCajaAlgomon) {
		
		this.presionado = false;
		this.cajaAlgomon = unaCajaAlgomon;
		this.cajaAlgomon.getBotonDeSelecion().setText(this.cajaAlgomon.getPokemon().getNombre());
	}
	//----------------------------------------------------------------------------------
	public void handle(ActionEvent event) {

		Entrenador entrenador = this.cajaAlgomon.getEntrenador();
		Pokemon unPokemon = this.cajaAlgomon.getPokemon();
		
		if(!this.presionado){
			try {
				entrenador.agregarPokemonAlEquipo(unPokemon);
				this.cajaAlgomon.agregarTilde();
				this.presionado = true;
			}
			catch (EquipoCompletoException e){
				e.printStackTrace();
			}
		}
		else{
			entrenador.borrarPokemon(unPokemon);
			this.cajaAlgomon.sacarTilde();
			this.presionado = false;
		}	
	}
	//----------------------------------------------------------------------------------
}
