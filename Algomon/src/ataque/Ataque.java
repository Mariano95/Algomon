package ataque;
import excepciones.NoPuedeRealizarElAtaqueException;
import excepciones.PokemonSeDebilitoException;
import pokemon.Pokemon;

public abstract class Ataque implements usable{

	protected String nombre;
	protected int potencia;
	protected int cantidad;
	protected int porcentajeDeDrenado = 0; // cu�nto del da�o provocado es absorvido por el pkmn atacante
	                                       // para chupavidas ser� 30%, para brasas ser� 0% por ejemplo
	public int getPotencia(){
		return this.potencia;
	}

	public int getPorcentajeDrenado(){
		return this.porcentajeDeDrenado;
	}
	
	public void aumentarCantidad(int cantidad){
		this.cantidad -= cantidad;
	}
	
	public void decrementarCantidad(){
		this.cantidad --;
	}
	
	public double ejecutarContra(Pokemon objetivo) throws NoPuedeRealizarElAtaqueException, PokemonSeDebilitoException{          //Pongo este metodo intermedio aca para no tener 
        if (this.cantidad == 0)                                                                                    //que poner el mismo if en cada uno de los 
			throw new NoPuedeRealizarElAtaqueException();                                                          //tipos de ataque
		return this.realizarAtaqueContra(objetivo);
	}

	abstract protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException;

	public String getNombre() {
		return this.nombre;
	}
}
