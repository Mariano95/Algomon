package eventos;

import aplicacion.DeclararGanador;
import ataque.Ataque;
import escenas.EscenaBatalla;
import excepciones.GanadorException;
import excepciones.PerdedorException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import juego.Juego;
//-------------------------------------------------------------------------------
public class BotonDeAtaqueEventHandler implements EventHandler<ActionEvent> {

	private Button botonDeAtaque;
	private Ataque ataque;
	private EscenaBatalla suEscena;
	//-------------------------------------------------------------------------------
	public BotonDeAtaqueEventHandler(Button botonDeAtaque, Ataque ataque, EscenaBatalla escenaBatalla) {
		
		this.botonDeAtaque = botonDeAtaque;
		this.ataque = ataque;
		this.botonDeAtaque.setText(this.ataque.getNombre());
		this.suEscena = escenaBatalla;
	}
	
	//-------------------------------------------------------------------------------
	public void handle(ActionEvent arg0) {
		try {
			Juego.atacar(ataque, this.suEscena.getPokemonOponente());
			Juego.cambioDeTurno();
			this.suEscena.getEscenaSiguiente().disparar();
		} 
		catch (GanadorException e) {
			DeclararGanador.start(Juego.getEntrenadorActual());
		}
		catch (PerdedorException e1) {
			DeclararGanador.start(Juego.getEntrenadorActual().getOponente());
		}
	
	}
	//-------------------------------------------------------------------------------
}
