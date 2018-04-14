package entrenador;

import java.util.HashMap;
import java.util.LinkedList;
import ataque.Ataque;
import elemento.Elemento;
import elemento.Pocion;
import elemento.Restaurador;
import elemento.SuperPocion;
import elemento.Vitamina;
import excepciones.EquipoCompletoException;
import excepciones.GanadorException;
import excepciones.PokemonPropioSeDebilitoException;
import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;
//--------------------------------------------------------
public class Entrenador {
	
	private LinkedList <Pokemon> colaPokemon; //Para llevar rastro de cu�l pkmn ingres� al equipo antes que otro
	private HashMap <String, Pokemon> equipoPokemon;
	private Pokemon pokemonActual;
	private String nombre;
	private Entrenador oponente;
	private int puntuacion;
	private Pocion pociones;
	private SuperPocion superPociones;
	private Restaurador restauradores;
	private Vitamina vitaminas;
	private LinkedList<Elemento> elementos;
	//--------------------------------------------------------
	public Entrenador(){
		this.equipoPokemon = new HashMap<String, Pokemon>();
		this.colaPokemon = new LinkedList<Pokemon>();
		this.puntuacion = 0;
		this.pociones = new Pocion(4);
		this.superPociones = new SuperPocion(2);
		this.restauradores = new Restaurador(3);
		this.vitaminas = new Vitamina(5);
		this.elementos = new LinkedList<Elemento>();
		this.elementos.add(pociones);
		this.elementos.add(restauradores);
		this.elementos.add(superPociones);
		this.elementos.add(vitaminas);
	}
	//--------------------------------------------------------
	public int getPuntaje(){
		return this.puntuacion;
	}
	//--------------------------------------------------------
	public String getNombre(){
		return this.nombre;
	}
	//--------------------------------------------------------
	public Pokemon getPokemonActual(){  //Devuelve al pokemon que el entrenador esta usando en ese momento
		return this.pokemonActual;
	}
	//--------------------------------------------------------
	public void setNombre(String unNombre){
		this.nombre = unNombre;
	}
	//--------------------------------------------------------
	public void setOponente(Entrenador unOponente){
		this.oponente = unOponente;
	}
	//--------------------------------------------------------
	public Entrenador getOponente(){
		return this.oponente;
	}
	//--------------------------------------------------------
	public void aumentarPuntuacion() throws GanadorException{
		
		this.puntuacion += 1;
		if(this.puntuacion == 3) throw new GanadorException();
	}
	//--------------------------------------------------------
	public int getPuntuacion(){
		return this.puntuacion;
	}
	//--------------------------------------------------------
	public void agregarPokemonAlEquipo(Pokemon unPokemon) throws EquipoCompletoException{
		
		if (equipoPokemon.size() == 0)
			this.pokemonActual = unPokemon;       //Refactorizar estos if
		if (equipoPokemon.size() == 3)
			throw new EquipoCompletoException();
		unPokemon.setEntrenador(this);
		equipoPokemon.put(unPokemon.getNombre(), unPokemon);
		colaPokemon.addLast(unPokemon);
	}
	//--------------------------------------------------------
	public void borrarPokemon(Pokemon unPokemon){

		this.equipoPokemon.remove(unPokemon.getNombre());
		colaPokemon.remove(unPokemon);
		this.pokemonActual = colaPokemon.peek();
	}
	//--------------------------------------------------------
	public int getCantidadDePokemones(){
		
		return this.equipoPokemon.size();
	}
	//--------------------------------------------------------
	public void darOrdenDeAtaque(Ataque unAtaque, Pokemon unPokemon) throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		pokemonActual.atacar(unAtaque, unPokemon); //La orden va siempre para el pkmn que este primero en el equipo
	}
	//--------------------------------------------------------
	public void usarElemento (Elemento unElemento){
		unElemento.aplicarEn(pokemonActual); 
	}
	//--------------------------------------------------------
	public void pedirCambio (String pokemonIngresante) throws PokemonSeDebilitoException{
		
		Pokemon pokemonAIngresar = this.equipoPokemon.get(pokemonIngresante);
		
		if ( pokemonAIngresar == null){//Si el diccionario no encuentra el valor asociado a la clave recibida, devuelve null.
			return;                                 
		}
		
		if ( pokemonAIngresar.getHP() <= 0 ){
			throw new PokemonSeDebilitoException();
		}
		
		this.pokemonActual = pokemonAIngresar;
	}
	//--------------------------------------------------------
	public LinkedList<Pokemon> getPokemons() {
		
		return this.colaPokemon;
	}
	//-------------------------------------------------------------------
	public LinkedList<Elemento> getElementos() {

		return this.elementos;
	}
	//-------------------------------------------------------------------
}
 