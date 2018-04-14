package juego;

import ataque.Ataque;
import elemento.Elemento;
import entrenador.Entrenador;
import excepciones.GanadorException;
import excepciones.PerdedorException;
import excepciones.PokemonPropioSeDebilitoException;
import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;
//-------------------------------------------------------------------------------
public class Juego {

	static Entrenador entrenadorTurnoActual;  //Al que le toca jugar en el turno
	//-------------------------------------------------------------------------------
	public static void comenzarBatalla(Entrenador unEntrenador, Entrenador otroEntrenador){
		unEntrenador.setOponente(otroEntrenador);
		otroEntrenador.setOponente(unEntrenador);
		entrenadorTurnoActual = unEntrenador; //Siempre arranca jugando el jugador 1
	}
	//-------------------------------------------------------------------------------
	public static void cambioDeTurno(){
		entrenadorTurnoActual = entrenadorTurnoActual.getOponente();
	}
	//-------------------------------------------------------------------------------
	public static void atacar(Ataque unAtaque, Pokemon unPokemon) throws GanadorException, PerdedorException{ //La interfaz recibira esta excepcion y se encargara de declarar ganador al que la lanzo. 
		try {											
			entrenadorTurnoActual.darOrdenDeAtaque(unAtaque, unPokemon);
		} 
		catch (PokemonSeDebilitoException e) {
			entrenadorTurnoActual.aumentarPuntuacion(); //Captura el mensaje lanzado por el pokemon enemigo y se aumenta su puntuacion en el marcador.
		}
		catch (PokemonPropioSeDebilitoException e1) {
			try{
				entrenadorTurnoActual.getOponente().aumentarPuntuacion(); //Captura el mensaje lanzado por el pokemon enemigo y se aumenta su puntuacion en el marcador.
			}
			catch (GanadorException e2){
				throw new PerdedorException();
			}
			
		}
		
	}
	//-------------------------------------------------------------------------------
	public static void usarElemento(Elemento unElemento){
		entrenadorTurnoActual.usarElemento(unElemento);
	}
	//-------------------------------------------------------------------------------
	public static void cambiarPokemon(String pokemonIngresante) throws PokemonSeDebilitoException{
		entrenadorTurnoActual.pedirCambio(pokemonIngresante);
	}
	//-------------------------------------------------------------------------------
	public static Entrenador getEntrenadorActual(){
		return entrenadorTurnoActual;
	}
	//-------------------------------------------------------------------------------
}