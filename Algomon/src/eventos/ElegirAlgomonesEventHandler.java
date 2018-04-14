package eventos;


import entrenador.Entrenador;
import escenas.Escena;
import escenas.EscenaNombrarJugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
//--------------------------------------------------------------------
public class ElegirAlgomonesEventHandler implements EventHandler<ActionEvent>{

	private Button BotonElegirAlgomones;
	private EscenaNombrarJugador escenaNombrarJugador;
	//------------------------------------------------------------------
	public ElegirAlgomonesEventHandler(EscenaNombrarJugador unaEscenaNombrarJugador){
		
		this.BotonElegirAlgomones = unaEscenaNombrarJugador.getBotonCrear();
		this.BotonElegirAlgomones.setText("crear");
		this.escenaNombrarJugador = unaEscenaNombrarJugador;
	}
	//------------------------------------------------------------------
	public void handle(ActionEvent event) {
		
		String nombreEntrenador = this.escenaNombrarJugador.getTextoDeCampo();
		if(nombreEntrenador.isEmpty()){
			this.escenaNombrarJugador.borrarTextoDeValidacion();
			this.escenaNombrarJugador.agragarTextoDeValidacion();
		}
		else{
			Entrenador unEntrenador = this.escenaNombrarJugador.getEntrenador();
			unEntrenador.setNombre(nombreEntrenador);
			
			Escena<?> unaEscena =  this.escenaNombrarJugador.getEscenaSiguiente();
			unaEscena.inicializarEscena();
			unaEscena.disparar();
		}
	}
	//------------------------------------------------------------------
}
