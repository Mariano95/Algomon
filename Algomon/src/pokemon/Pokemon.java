package pokemon;


import java.util.List;

import Accionar.ModoDeAccion;
import ataque.Ataque;
import ataque.Fogonazo;
import entrenador.Entrenador;
import excepciones.PokemonPropioSeDebilitoException;
//import entrenador.Entrenador;
import excepciones.PokemonSeDebilitoException;

public abstract class Pokemon {

	protected double HP;
	protected double HPMax;
	protected String nombre;
	protected List<Ataque> ataques;
	protected Entrenador entrenador;
	protected ModoDeAccion accionador;
	
	public Pokemon(){
		this.accionador = new ModoDeAccion();
	}
	
	public double getHP(){
		return this.HP;
	}
	
	public double getHPMax(){
		return this.HPMax;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setEntrenador(Entrenador unEntrenador){
		this.entrenador = unEntrenador;
	}
	
	public void setHP(double cantidad){
		this.HP = cantidad;
	}
	
	public List<Ataque> getAtaques(){
		return this.ataques;
	}
	
	public void regresarAModoNormal(){
		this.accionador.normal();
	}
	
	public void atacar(Ataque unAtaque, Pokemon objetivo) throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		int danioProvocado = (int) this.accionador.accionar(this, unAtaque, objetivo);
		this.aumentarHP ( ( unAtaque.getPorcentajeDrenado() * danioProvocado ) / 100 );
	}
	
	
	public double recibirAtaqueDeFuego(Ataque unAtaque) throws PokemonSeDebilitoException{ //A diferencia del piedra-papel-tijera, hace falta pasar el ataque por parametro, porque no todos hacen el mismo daño
		return this.danioNormal(unAtaque);
	} 
	
	public int recibirAtaqueCanto() {
		this.accionador.inactivoTresTurnos(); 
		return 0;
	}
	
	public double recibirFogonazo(Fogonazo unFogonazo) throws PokemonSeDebilitoException {
		double danioProvocado = this.recibirAtaqueDeFuego(unFogonazo);
		this.accionador.danioPermanente();
		return danioProvocado;
	}
	
	public double recibirAtaqueDeAgua(Ataque unAtaque) throws PokemonSeDebilitoException{
		return this.danioNormal(unAtaque);
	}
	
	public double recibirAtaqueDeHierba(Ataque unAtaque) throws PokemonSeDebilitoException{
		return this.danioNormal(unAtaque);
	}
	
	public double recibirAtaqueNormal(Ataque unAtaque) throws PokemonSeDebilitoException{
		return this.danioNormal(unAtaque);
	} 
	
	public double danioNormal(Ataque unAtaque) throws PokemonSeDebilitoException{
		return this.recibirDanio(unAtaque.getPotencia());
	}

	public double superEfectivo(Ataque unAtaque) throws PokemonSeDebilitoException{
		return this.recibirDanio(2 * unAtaque.getPotencia());
	}

	public double noMuyEfectivo(Ataque unAtaque) throws PokemonSeDebilitoException{
		return this.recibirDanio( unAtaque.getPotencia() / 2 );
	}
	
	public double recibirDanio(double cantidadHP) throws PokemonSeDebilitoException {
		try {
			this.accionador.recibirDanio(this, cantidadHP);
		} catch (PokemonSeDebilitoException e) {
			this.accionador.debilitado();
			throw new PokemonSeDebilitoException();
		}
		return cantidadHP;
	}

	public void decrementarHP(double cantidadHP){
		this.HP -= cantidadHP;
		if ( this.HP < 0 ) {
			this.HP = 0;
		}
	}
	
	public void aumentarHP (double cantidad){
		this.HP = this.HP + cantidad;
		if ( this.HP > this.HPMax )
			this.HP = this.HPMax;
	}
	
	public String getNombreDelModoActual(){
		return this.accionador.getNombreDelModo();
	}
}
