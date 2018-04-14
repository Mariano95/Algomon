package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ataque.Brasas;
import ataque.Burbuja;
import ataque.Canto;
import ataque.CanionDeAgua;
import ataque.Chupavidas;
import ataque.Fogonazo;
import ataque.LatigoCepa;
import elemento.Pocion;
import elemento.Restaurador;
import elemento.SuperPocion;
import entrenador.Entrenador;
import excepciones.EquipoCompletoException;
import excepciones.GanadorException;
import excepciones.PerdedorException;
import excepciones.PokemonPropioSeDebilitoException;
import excepciones.PokemonSeDebilitoException;
import juego.Juego;
import ataque.AtaqueRapido;
import pokemon.Bulbasaur;
import pokemon.Chansey;
import pokemon.Charmander;
import pokemon.Jigglypuff;
import pokemon.Rattata;
import pokemon.Squirtle;


public class AlgomonTest {

	@Test
	public void test01SquirtleAtacaConBurbujaYLeQuita20DeVidaACharmander() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		Burbuja unBurbuja = new Burbuja();
		double HPInicialCharmander = unCharmander.getHP();
		unSquirtle.atacar(unBurbuja, unCharmander);
		assert (unCharmander.getHP() == HPInicialCharmander - 20);
	}
	
	@Test
	public void test02SquirtleAtacaConBurbujaYLeQuita10DeVidaAChansey() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey = new Chansey();
		Burbuja unBurbuja = new Burbuja();
		double HPInicialChansey = unChansey.getHP();
		unSquirtle.atacar(unBurbuja, unChansey);
		assert (unChansey.getHP() == HPInicialChansey - 10);
	}
	
	@Test
	public void test03SquirtleAtacaConBurbujaYLeQuita5DeVidaABulbasaur() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{  
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Burbuja unBurbuja = new Burbuja();
		double HPInicialBulbasaur = unBulbasaur.getHP();
		unSquirtle.atacar(unBurbuja, unBulbasaur);
		assertEquals(HPInicialBulbasaur - 5, unBulbasaur.getHP(), 0.0001D);
	}
	
	@Test
	public void test04SquirtleAtacaConAtaqueRapidoYLeQuita10DeVidaACharmander() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		double HPInicialCharmander = unCharmander.getHP();
		unSquirtle.atacar(unAtaqueRapido, unCharmander);
		assert (unCharmander.getHP() == HPInicialCharmander - 10);
	}
	
	@Test
	public void test05SquirtleAtacaConCanionDeAguaACharmander() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		CanionDeAgua unCanionDeAgua = new CanionDeAgua();
		double HPInicialCharmander = unCharmander.getHP();
		unSquirtle.atacar(unCanionDeAgua, unCharmander);
		assert (unCharmander.getHP() == HPInicialCharmander - 40);
	}
	 @Test
	public void test06SquirtleAtacaConCanionDeAguaYLeQuita10DeVidaABulbasaur() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		CanionDeAgua unCanionDeAgua = new CanionDeAgua();
		double HPInicialBulbasaur = unBulbasaur.getHP();
		unSquirtle.atacar(unCanionDeAgua, unBulbasaur);
		assertEquals(HPInicialBulbasaur - 10, unBulbasaur.getHP(), 0.0001D);
	}
	 
	 @Test
	 public void test07SquirtleAtacaConBurbujaYLeQuita10DeVidaAJigglypuff () throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
	 	Squirtle unSquirtle = new Squirtle();
	 	Jigglypuff  unJigglypuff  = new Jigglypuff ();
	 	Burbuja unBurbuja = new Burbuja();
	 	double HPInicialJigglypuff  = unJigglypuff.getHP();
	 	unSquirtle.atacar(unBurbuja, unJigglypuff );
	 	assert (unJigglypuff .getHP() == HPInicialJigglypuff  - 10);
	 }
	 
	 @Test
	 public void test08SquirtleAtacaConBurbujaYLeQuita10DeVidaARattata() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
	 	Squirtle unSquirtle = new Squirtle();
	 	Rattata  unRattata  = new Rattata();
	 	Burbuja unBurbuja = new Burbuja();
	 	double HPInicialRattata  = unRattata.getHP();
	 	unSquirtle.atacar(unBurbuja, unRattata );
	 	assert (unRattata .getHP() == HPInicialRattata  - 10);
	 }
	 
	 @Test
	 public void test09SquirtleAtacaConCanionDeAguaYLeQuita20DeVidaAChansey() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
	 	Squirtle unSquirtle = new Squirtle();
	 	Chansey unChansey = new Chansey();
	 	CanionDeAgua unCanionDeAgua = new CanionDeAgua();
	 	double HPInicialChansey = unChansey.getHP();
	 	unSquirtle.atacar(unCanionDeAgua, unChansey);
	 	assert (unChansey.getHP() == HPInicialChansey - 20);
	 }
	 
	 @Test
	 public void test10SquirtleAtacaConCanionDeAguaYLeQuita20DeVidaAJigglypuff () throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
	 	Squirtle unSquirtle = new Squirtle();
	 	Jigglypuff  unJigglypuff  = new Jigglypuff ();
	 	CanionDeAgua unCanionDeAgua = new CanionDeAgua();
	 	double HPInicialJigglypuff  = unJigglypuff.getHP();
	 	unSquirtle.atacar(unCanionDeAgua, unJigglypuff );
	 	assert (unJigglypuff .getHP() == HPInicialJigglypuff  - 20);
	 }
	 
	 @Test
	 public void test11SquirtleAtacaCanionDeAguaYLeQuita20DeVidaARattata() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 	Squirtle unSquirtle = new Squirtle();
		 	Rattata  unRattata  = new Rattata();
		 	CanionDeAgua unCanionDeAgua = new CanionDeAgua();
		 	double HPInicialRattata  = unRattata.getHP();
		 	unSquirtle.atacar(unCanionDeAgua, unRattata );
		 	assert (unRattata .getHP() == HPInicialRattata  - 20);
		 }
	
	 
	 @Test
	 public void test12BulbasorAtacaASquirtleConLatigoCepaYLeQuita30DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Bulbasaur unBulbasaur = new Bulbasaur();
		 Squirtle unSquirtle = new Squirtle();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPSquirtleInicial = unSquirtle.getHP();
		 unBulbasaur.atacar(unLatiagoCepa, unSquirtle);
		 assert (unSquirtle.getHP() == HPSquirtleInicial  - 30);
	 }
	 
	 @Test
	 public void test13BulbasorAtacaACharmanderConLatigoCepaYLeQuita7DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Bulbasaur unBulbasaur = new Bulbasaur();
		 Charmander unCharmander = new Charmander();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPCharmanderInicial = unCharmander.getHP();
		 unBulbasaur.atacar(unLatiagoCepa, unCharmander);
		 assertEquals(HPCharmanderInicial  - 7, unCharmander.getHP(), 0.0001D);
	 }
	 
	 @Test
	 public void test14BulbasorAtacaAJigglypuffConLatigoCepaYLeQuita15DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Bulbasaur unBulbasaur = new Bulbasaur();
		 Jigglypuff unJigglypuff = new Jigglypuff();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPJigglypuffInicial = unJigglypuff.getHP();
		 unBulbasaur.atacar(unLatiagoCepa, unJigglypuff);
		 assert (unJigglypuff.getHP() == HPJigglypuffInicial  - 15);
	 }
	 
	 @Test
	 public void test15BulbasorAtacaAChanseyConLatigoCepaYLeQuita15DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Bulbasaur unBulbasaur = new Bulbasaur();
		 Chansey unChansey = new Chansey();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPChanseyInicial = unChansey.getHP();
		 unBulbasaur.atacar(unLatiagoCepa, unChansey);
		 assert (unChansey.getHP() == HPChanseyInicial  - 15);
	 }
	 
	 @Test
	 public void test16BulbasorAtacaARattataConLatigoCepaYLeQuita15DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Bulbasaur unBulbasaur = new Bulbasaur();
		 Rattata unRattata = new Rattata();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPRattataInicial = unRattata.getHP();
		 unBulbasaur.atacar(unLatiagoCepa, unRattata);
		 assertEquals ( HPRattataInicial - 15, unRattata.getHP(), 0.0001D);
	 }
	
	 @Test
	 public void test17ChanseyAtacaASquirtleConLatigoCepaYLeQuita30DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Chansey unChansey = new Chansey();
		 Squirtle unSquirtle = new Squirtle();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPSquirtleInicial = unSquirtle.getHP();
		 unChansey.atacar(unLatiagoCepa, unSquirtle);
		 assert (unSquirtle.getHP() == HPSquirtleInicial  - 30);
	 }
	 
	 @Test
	 public void test18ChanseyAtacaACharmanderConLatigoCepaYLeQuita7DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Chansey unChansey = new Chansey();
		 Charmander unCharmander = new Charmander();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPCharmanderInicial = unCharmander.getHP();
		 unChansey.atacar(unLatiagoCepa, unCharmander);
		 assertEquals(HPCharmanderInicial  - 7, unCharmander.getHP(), 0.0001D);
	 }
	 
	 @Test
	 public void test19ChanseyAtacaAJigglypuffConLatigoCepaYLeQuita15DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Chansey unChansey = new Chansey();
		 Jigglypuff unJigglypuff = new Jigglypuff();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPJigglypuffInicial = unJigglypuff.getHP();
		 unChansey.atacar(unLatiagoCepa, unJigglypuff);
		 assert (unJigglypuff.getHP() == HPJigglypuffInicial  - 15);
	 }
	 
	 @Test
	 public void test20ChanseyAtacaABulbasaurConLatigoCepaYLeQuita7DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Chansey unChansey = new Chansey();
		 Bulbasaur unBulbasaur = new Bulbasaur();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPBulbasaurInicial = unBulbasaur.getHP();
		 unChansey.atacar(unLatiagoCepa, unBulbasaur);
		 assertEquals (HPBulbasaurInicial  - 7, unBulbasaur.getHP(), 0.0001D);
	 }
	 
	 @Test
	 public void test21ChanseyAtacaARattataConLatigoCepaYLeQuita15DeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Bulbasaur unChansey = new Bulbasaur();
		 Rattata unRattata = new Rattata();
		 LatigoCepa unLatiagoCepa = new LatigoCepa();
		 double HPRattataInicial = unRattata.getHP();
		 unChansey.atacar(unLatiagoCepa, unRattata);
		 assert (unRattata.getHP() == HPRattataInicial  - 15);
	 }
	 
	 @Test
	 public void test22CharmanderAtacaABulbasaurConBrasasyLeQuita32DeVidad() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Charmander unCharmander = new Charmander();
		 Bulbasaur unBulbasaur = new Bulbasaur();
		 Brasas brasas = new Brasas();
		 double HPInicialBulbasaur = unBulbasaur.getHP();
		 unCharmander.atacar(brasas, unBulbasaur);
		 assertEquals (HPInicialBulbasaur  - 32, unBulbasaur.getHP(), 0.0001D);
	 }
	 
	 @Test
	 public void test23CharmanderAtacaASquirtleConBrasasyLeQuita8DeVidad() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Charmander unCharmander = new Charmander();
		 Squirtle unSquirtle = new Squirtle();
		 Brasas brasas = new Brasas();
		 double HPInicialSquirtle = unSquirtle.getHP();
		 unCharmander.atacar(brasas, unSquirtle);
		 assertEquals (HPInicialSquirtle - 8, unSquirtle.getHP(), 0.0001D);
	 }
	 
	 @Test
	 public void test24CharmanderAtacaAJigglypuffConBrasasyLeQuita16DeVidad() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Charmander unCharmander = new Charmander();
		 Jigglypuff unJigglypuff = new Jigglypuff();
		 Brasas brasas = new Brasas();
		 double HPInicialJigglypuff = unJigglypuff.getHP();
		 unCharmander.atacar(brasas, unJigglypuff);
		 assertEquals (HPInicialJigglypuff - 16, unJigglypuff.getHP(), 0.0001D);
	 } 
	 
	 @Test
	 public void test25CharmanderAtacaAChanseyConBrasasyLeQuita16DeVidad() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Charmander unCharmander = new Charmander();
		 Chansey unChansey = new Chansey();
		 Brasas brasas = new Brasas();
		 double HPInicialChansey = unChansey.getHP();
		 unCharmander.atacar(brasas, unChansey);
		 assertEquals (HPInicialChansey - 16, unChansey.getHP(), 0.0001D);
	 } 
	 
	 
	 @Test
	 public void test26CharmanderAtacaARattataConBrasasyLeQuita16DeVidad() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Charmander unCharmander = new Charmander();
		 Rattata unRattata = new Rattata();
		 Brasas brasas = new Brasas();
		 double HPInicialRattata = unRattata.getHP();
		 unCharmander.atacar(brasas, unRattata);
		 assertEquals (HPInicialRattata - 16, unRattata.getHP(), 0.0001D);
	 }
	 
	
	@Test 
	public void test27CharmanderAgotaSuFogonazoYaNoPuedeVolverAUsarlo() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		 Charmander unCharmander = new Charmander();
		 Rattata unRattata = new Rattata();
		 Fogonazo unFogonazo = new Fogonazo();
		 for (int x = 0; x < 4; x++)
			 unCharmander.atacar(unFogonazo, unRattata);
		//Cuando salimos del for, chamander ya agotñ su ataque
		double HPRattata = unRattata.getHP();
		unCharmander.atacar(unFogonazo, unRattata); //Este ataque no tiene que ejecutarse
		assertEquals (HPRattata, unRattata.getHP(), 0.0001D); //Como el ataque no se ejecutñ, sus puntos de vida tienen que seguir igual
		unCharmander.atacar(unFogonazo, unRattata);
		assertEquals (HPRattata, unRattata.getHP(), 0.0001D);
		unCharmander.atacar(unFogonazo, unRattata);
		assertEquals (HPRattata, unRattata.getHP(), 0.0001D); //Probamos algunas veces mñs para comprobar que el ataque queda inhabilitado permanentemente
		
	}
	
	@Test
	public void test29JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDanioProbandoUnTurno () throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Jigglypuff  unJigglypuff  = new Jigglypuff ();
		Canto canto = new Canto();
		unJigglypuff.atacar(canto, unSquirtle);
		double HPInicialJigglypuff  = unJigglypuff.getHP();
		Burbuja unBurbuja = new Burbuja();
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		assertEquals(HPInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
	}
	
	@Test
	public void test30JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDanioProbandoDosTurnos () throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Jigglypuff  unJigglypuff  = new Jigglypuff ();
		Canto canto = new Canto();
		unJigglypuff.atacar(canto, unSquirtle);
		double HPInicialJigglypuff  = unJigglypuff.getHP();
		Burbuja unBurbuja = new Burbuja();
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		assertEquals(HPInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
	}
	
	@Test
	public void test31JigglypuffAtacaConCantoYDuermeSquirtleQuienNoLeCausaDanioProbandoTresTurnos () throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Jigglypuff  unJigglypuff  = new Jigglypuff ();
		Canto canto = new Canto();
		unJigglypuff.atacar(canto, unSquirtle);
		double HPInicialJigglypuff  = unJigglypuff.getHP();
		Burbuja unBurbuja = new Burbuja();
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		assertEquals(HPInicialJigglypuff, unJigglypuff.getHP(), 0.0001D);
	}
	
	@Test
	public void test32JigglypuffAtacaConCantoYDuermeSquirtleQuienLeCausaDanioLuegoDeTresTurnos() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Jigglypuff  unJigglypuff  = new Jigglypuff ();
		Canto canto = new Canto();
		unJigglypuff.atacar(canto, unSquirtle);
		double HPInicialJigglypuff  = unJigglypuff.getHP();
		Burbuja unBurbuja = new Burbuja();
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		unSquirtle.atacar(unBurbuja, unJigglypuff );
		assertEquals ( HPInicialJigglypuff - 10, unJigglypuff.getHP(), 0.0001D );
	}
	
	@Test
	public void test33CharmanderAtacaABulbasaurConFogonazoQuitandole4PuntosDeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Fogonazo unFogonazo = new Fogonazo();
		Bulbasaur unBulbasaur = new Bulbasaur();
		double HPInicialBulbasaur = unBulbasaur.getHP();
		unCharmander.atacar(unFogonazo, unBulbasaur);
		assert ( HPInicialBulbasaur - 4 == unBulbasaur.getHP() );
	}
	
	@Test
	public void test34CharmanderAtacaASquirtleConFogonazoQuitandole1PuntoDeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Fogonazo unFogonazo = new Fogonazo();
		Squirtle unSquirtle = new Squirtle();
		double HPInicialSquirtle = unSquirtle.getHP();
		unCharmander.atacar(unFogonazo, unSquirtle);
		assert ( HPInicialSquirtle - 1 == unSquirtle.getHP() );
	}
	
	@Test
	public void test35CharmanderAtacaARattataConFogonazoQuitandole2PuntosDeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Fogonazo unFogonazo = new Fogonazo();
		Rattata unRattata = new Rattata();
		double HPInicialRattata = unRattata.getHP();
		unCharmander.atacar(unFogonazo, unRattata);
		assert ( HPInicialRattata - 2 == unRattata.getHP() );
	}
	
	@Test
	public void test36CharmanderAtacaABulbasaurConFogonazoProvocandoleUnDanioPermanenteDe14Puntos() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Fogonazo unFogonazo = new Fogonazo();
		Bulbasaur unBulbasaur = new Bulbasaur();
		unCharmander.atacar(unFogonazo, unBulbasaur);
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		double HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualBulbasaur - 14 == unBulbasaur.getHP() );
		HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualBulbasaur - 14 == unBulbasaur.getHP() );
		HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualBulbasaur - 14 == unBulbasaur.getHP() );
		HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualBulbasaur - 14 == unBulbasaur.getHP() );
	}
	
	@Test
	public void test37CharmanderAtacaASquirtleConFogonazoProvocandoleUnDanioPermanenteDe15Puntos() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Fogonazo unFogonazo = new Fogonazo();
		Squirtle unSquirtle = new Squirtle();
		unCharmander.atacar(unFogonazo, unSquirtle);
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		double HPActualSquirtle = unSquirtle.getHP();
		unSquirtle.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualSquirtle - 15 == unSquirtle.getHP() );
		HPActualSquirtle = unSquirtle.getHP();
		unSquirtle.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualSquirtle - 15 == unSquirtle.getHP() );
		HPActualSquirtle = unSquirtle.getHP();
		unSquirtle.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualSquirtle - 15 == unSquirtle.getHP() );
		HPActualSquirtle = unSquirtle.getHP();
		unSquirtle.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualSquirtle - 15 == unSquirtle.getHP() );
	}
	
	@Test
	public void test38CharmanderAtacaARattataConFogonazoProvocandoleUnDanioPermanenteDe17Puntos() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Fogonazo unFogonazo = new Fogonazo();
		Rattata unRattata = new Rattata();
		unCharmander.atacar(unFogonazo, unRattata);
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		double HPActualRattata = unRattata.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualRattata - 17 == unRattata.getHP() );
		HPActualRattata = unRattata.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualRattata - 17 == unRattata.getHP() );
		HPActualRattata = unRattata.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualRattata - 17 == unRattata.getHP() );
		HPActualRattata = unRattata.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( HPActualRattata - 17 == unRattata.getHP() );
	}
	
	@Test
	public void test39BulbasaurAtacaARattataConChupavidasYLeQuita15PuntosDeVidaGanandoLuego4PuntosDeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Rattata unRattata = new Rattata();
		double HPInicialRattata = unRattata.getHP();
		Bulbasaur unBulbasaur = new Bulbasaur();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		Chupavidas unChupavidas = new Chupavidas();
		unRattata.atacar(unAtaqueRapido, unBulbasaur);
		double HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unChupavidas, unRattata);
		assert ( unRattata.getHP() == HPInicialRattata - 15 );
		assert ( unBulbasaur.getHP() == HPActualBulbasaur + 4 );
	}
	
	@Test
	public void test40BulbasaurAtacaASquirtleConChupavidasYLeQuita30PuntosDeVidaGanandoLuego9PuntosDeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		double HPInicialSquirtle = unSquirtle.getHP();
		Bulbasaur unBulbasaur = new Bulbasaur();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		Chupavidas unChupavidas = new Chupavidas();
		unSquirtle.atacar(unAtaqueRapido, unBulbasaur);
		double HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unChupavidas, unSquirtle);
		assert ( unSquirtle.getHP() == HPInicialSquirtle - 30 );
		assert ( unBulbasaur.getHP() == HPActualBulbasaur + 9 );
	}
	
	@Test
	public void test41BulbasaurAtacaACharmanderConChupavidasYLeQuita7PuntosDeVidaGanandoLuego2PuntosDeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		double HPInicialCharmander = unCharmander.getHP();
		Bulbasaur unBulbasaur = new Bulbasaur();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		Chupavidas unChupavidas = new Chupavidas();
		unCharmander.atacar(unAtaqueRapido, unBulbasaur);
		double HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unChupavidas, unCharmander);
		assert ( unCharmander.getHP() == HPInicialCharmander - 7 );
		assert ( unBulbasaur.getHP() == HPActualBulbasaur + 2 );
	}
	
	@Test
	public void test42BulbasaurAtacaAOtroBulbasaurConChupavidasYLeQuita7PuntosDeVidaGanandoLuego2PuntosDeVida() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Bulbasaur otroBulbasaur = new Bulbasaur();
		double HPInicialOtroBulbasaur = otroBulbasaur.getHP();
		Bulbasaur unBulbasaur = new Bulbasaur();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		Chupavidas unChupavidas = new Chupavidas();
		otroBulbasaur.atacar(unAtaqueRapido, unBulbasaur);
		double HPActualBulbasaur = unBulbasaur.getHP();
		unBulbasaur.atacar(unChupavidas, otroBulbasaur);
		assert ( otroBulbasaur.getHP() == HPInicialOtroBulbasaur - 7 );
		assert ( unBulbasaur.getHP() == HPActualBulbasaur + 2 );
	}

	@Test
	public void test43CharmanderQuemaAUnRattaDormidoQueNoPuedeAtacarPorTresTurnosYLeGeneraDanioPermanenteDe17() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		Fogonazo unFogonazo = new Fogonazo();
		Canto unCanto = new Canto();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		double HPInicialCharmander = unCharmander.getHP();
		double HPActualRattata = ( unRattata.getHP() - 2 ); //El fogonazo le habia quitado 2HP 
		unCharmander.atacar(unCanto, unRattata);
		unCharmander.atacar(unFogonazo, unRattata);
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( unCharmander.getHP() == HPInicialCharmander ); //Rattata no puede atacar (quedan 2 turnos)
		assert ( unRattata.getHP() == HPActualRattata - 17 ); //El fogonazo dania a Rattata
		HPActualRattata = unRattata.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( unCharmander.getHP() == HPInicialCharmander ); //Rattata no puede atacar (quedan 1 turno)
		assert ( unRattata.getHP() == HPActualRattata - 17 ); //El fogonazo dania a Rattata
		HPActualRattata = unRattata.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( unCharmander.getHP() == HPInicialCharmander ); //Rattata no puede atacar (al proximo tiene que poder hacerlo)
		assert ( unRattata.getHP() == HPActualRattata - 17 ); //El fogonazo dania a Rattata
		HPActualRattata = unRattata.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( unCharmander.getHP() == HPInicialCharmander - 10 ); //Rattata salio de la inactividad
		assert ( unRattata.getHP() == HPActualRattata - 17 ); //El danio permanente continua
	}

	
	@Test
	public void test44UnPokemonDebilitadoNoPuedeAtacar() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		try {
			unCharmander.recibirDanio(unCharmander.getHP());
		} catch (PokemonSeDebilitoException e) {}  //No hago nada con esta excepcion, no es lo que me interesa probar ahora
		Fogonazo unFogonazo = new Fogonazo();
		double HPInicialRattata = unRattata.getHP();
		unCharmander.atacar(unFogonazo, unRattata);
		assert ( unRattata.getHP() == HPInicialRattata ); //Como charmander esta debilitado, su ataque no tiene efecto
	}


	@Test
	public void test45UnPokemonDebilitadoNoPuedeRecibirMasDanio() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		try {
			unCharmander.recibirDanio(unCharmander.getHP());
		} catch (PokemonSeDebilitoException e) {}  //No hago nada con esta excepcion, no es lo que me interesa probar ahora
		double HPCharmander = unCharmander.getHP();
		unRattata.atacar(unAtaqueRapido, unCharmander);
		assert ( unCharmander.getHP() == HPCharmander ); //Como charmander esta debilitado, ya no pierde mas puntos de vida
	}

	
	@Test (expected = EquipoCompletoException.class )
	public void test46UnEntrenadorNoPuedeAgregarMasDeTresPokemonEnSuEquipo() throws EquipoCompletoException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		Entrenador unEntrenador = new Entrenador();
		unEntrenador.agregarPokemonAlEquipo(unCharmander);
		unEntrenador.agregarPokemonAlEquipo(unSquirtle);
		unEntrenador.agregarPokemonAlEquipo(unBulbasaur);
		unEntrenador.agregarPokemonAlEquipo(unRattata); //Aca tiene que saltar la excepcion
	}


	@Test
	public void test47UnEntrenadorOrdenaASuPokemonAtacarYEsteLoHace() throws EquipoCompletoException, PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		Entrenador unEntrenador = new Entrenador();
		Burbuja unBurbuja = new Burbuja();
		double HPInicialRattata = unRattata.getHP();
		unEntrenador.agregarPokemonAlEquipo(unSquirtle);
		unEntrenador.darOrdenDeAtaque(unBurbuja, unRattata);
		assert (unRattata.getHP() == HPInicialRattata - 10 );
	}

	
	@Test
	public void test48ElPrimerPokemonQueAgregaElEntrenadorAlEquipoSeraElPokemonActual() throws EquipoCompletoException{
		Squirtle unSquirtle = new Squirtle();
		Entrenador unEntrenador = new Entrenador();
		unEntrenador.agregarPokemonAlEquipo(unSquirtle);
		assert (unEntrenador.getPokemonActual() == unSquirtle);
	}
	
	@Test
	public void test49IntercambiarPokemonDelEquipo() throws EquipoCompletoException, PokemonSeDebilitoException{
		@SuppressWarnings("unused")
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		Entrenador unEntrenador = new Entrenador();
		unEntrenador.agregarPokemonAlEquipo(unRattata);
		unEntrenador.agregarPokemonAlEquipo(unRattata);
		unEntrenador.pedirCambio("rattata");
		assert (unEntrenador.getPokemonActual() == unRattata);
	}


	@Test
	public void test50TratarDeIntercambiarPorUnPokemonQueNoEstaEnElEquipoNoGeneraNingunCambio() throws EquipoCompletoException, PokemonSeDebilitoException{
		Rattata unRattata = new Rattata();
		Entrenador unEntrenador = new Entrenador();
		unEntrenador.agregarPokemonAlEquipo(unRattata);
		unEntrenador.pedirCambio("bulbasaur");
		assert (unEntrenador.getPokemonActual() == unRattata);
	}


	@Test (expected = PokemonSeDebilitoException.class)
	public void test51TratarDeCambiarAUnPokemonPorOtroQueEstaDebilitadoGeneraExcepcion() throws EquipoCompletoException, PokemonSeDebilitoException{
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();
		try {
			unBulbasaur.recibirDanio( unBulbasaur.getHP() );
		} catch (PokemonSeDebilitoException e) {}
		Entrenador unEntrenador = new Entrenador();
		unEntrenador.agregarPokemonAlEquipo(unRattata);
		unEntrenador.agregarPokemonAlEquipo(unBulbasaur);
		unEntrenador.pedirCambio("bulbasaur");
	}


	@Test
	public void test52ElCambiarDeTurnoDuranteLaBatallaCambiaAlEntrenadorActual(){
		Entrenador unEntrenador = new Entrenador();
		Entrenador otroEntrenador = new Entrenador();
		Juego.comenzarBatalla(unEntrenador, otroEntrenador);
		Juego.cambioDeTurno();
		assert (Juego.getEntrenadorActual() == otroEntrenador);
	}


	@Test
	public void test53ElMetodoAtacarDeJuegoProvocaQueAtaqueSolamenteElEntrenadorActual() throws EquipoCompletoException, PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Entrenador unEntrenador = new Entrenador();
		Entrenador otroEntrenador = new Entrenador();
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		unEntrenador.agregarPokemonAlEquipo(unRattata);
		otroEntrenador.agregarPokemonAlEquipo(unSquirtle);
		double HPInicialRattata = unRattata.getHP();
		double HPInicialSquirtle = unSquirtle.getHP();
		Juego.comenzarBatalla(unEntrenador, otroEntrenador);
		unEntrenador.darOrdenDeAtaque(unAtaqueRapido, unSquirtle);
		assert (unSquirtle.getHP() == HPInicialSquirtle - 10);
		assert (unRattata.getHP() == HPInicialRattata);
		}
	
	
	@Test
	public void test54UsarPocionEnPokemonLeDevuelve20PuntosDeVida() throws PokemonSeDebilitoException{
		Pocion unaPocion = new Pocion(1);
		Charmander unCharmander = new Charmander();
		unCharmander.recibirDanio(40);
		double HPCharmander = unCharmander.getHP();
		unaPocion.aplicarEn(unCharmander);
		assert (unCharmander.getHP() == HPCharmander + 20);
	}
	
	@Test 
	public void test55UsarPocionEnPokemonConPuntosDeVidaATopeNoTieneEfecto(){
		Pocion unaPocion = new Pocion(1);
		Charmander unCharmander = new Charmander();
		double HPCharmander = unCharmander.getHP();
		unaPocion.aplicarEn(unCharmander);
		assert ( unCharmander.getHP() == HPCharmander );
	}

	
	@Test
	public void test56TratarDeUsarPocionesCuandoYaNoQuedanMasNoProduceEfecto() throws PokemonSeDebilitoException{
		Pocion unaPocion = new Pocion(0);
		Charmander unCharmander = new Charmander();
		unCharmander.recibirDanio(40);
		double HPCharmander = unCharmander.getHP();
		unaPocion.aplicarEn(unCharmander);
		assert (unCharmander.getHP() == HPCharmander);
	}
	
	@Test
	public void test57UsarSuperPocionEnPokemonLeDevuelve40PuntosDeVida() throws PokemonSeDebilitoException{
		SuperPocion unaSuperPocion = new SuperPocion(1);
		Charmander unCharmander = new Charmander();
		unCharmander.recibirDanio(80);
		double HPCharmander = unCharmander.getHP();
		unaSuperPocion.aplicarEn(unCharmander);
		assert (unCharmander.getHP() == HPCharmander + 40);
	}
	
	@Test 
	public void test58UsarSuperPocionEnPokemonConPuntosDeVidaATopeNoTieneEfecto(){
		SuperPocion unaSuperPocion = new SuperPocion(1);
		Charmander unCharmander = new Charmander();
		double HPCharmander = unCharmander.getHP();
		unaSuperPocion.aplicarEn(unCharmander);
		assert ( unCharmander.getHP() == HPCharmander );
	}

	
	@Test
	public void test59TratarDeUsarSuperPocionesCuandoYaNoQuedanMasNoProduceEfecto() throws PokemonSeDebilitoException{
		SuperPocion unaSuperPocion = new SuperPocion(0);
		Charmander unCharmander = new Charmander();
		unCharmander.recibirDanio(40);
		double HPCharmander = unCharmander.getHP();
		unaSuperPocion.aplicarEn(unCharmander);
		assert (unCharmander.getHP() == HPCharmander);
	}

	@Test
	public void test60RestauradorDevuelveAlpokemonASuEstadoNormal() throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException{
		Restaurador unRestaurador = new Restaurador(1);
		Charmander unCharmander = new Charmander();
		double HPCharmander = unCharmander.getHP();
		Rattata unRattata = new Rattata();
		Canto unCanto = new Canto();
		Fogonazo unFogonazo = new Fogonazo();
		AtaqueRapido unAtaqueRapido = new AtaqueRapido();
		unCharmander.atacar(unCanto, unRattata);
		unCharmander.atacar(unFogonazo, unRattata);
		double HPRattata =  unRattata.getHP();
		unRestaurador.aplicarEn(unRattata);
		unRattata.atacar(unAtaqueRapido, unCharmander); //En condiciones normales, rattata no podria atacar y sufriria 17 de danio
		assert (unCharmander.getHP() == HPCharmander - 10);
		assert (unRattata.getHP() == HPRattata);
	}

	@Test 
	public void test61EntrenadorDerrotaAUnPokemonDelOponenteYGanaUnPunto() throws EquipoCompletoException, GanadorException, PerdedorException {
		Charmander unChamander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Entrenador unEntrenador = new Entrenador();
		Entrenador otroEntrenador = new Entrenador();
		unEntrenador.agregarPokemonAlEquipo(unChamander);
		otroEntrenador.agregarPokemonAlEquipo(unBulbasaur);
		Juego.comenzarBatalla(unEntrenador, otroEntrenador);
		Brasas unBrasas = new Brasas();
		Juego.atacar(unBrasas, unBulbasaur);
		Juego.atacar(unBrasas, unBulbasaur);
		Juego.atacar(unBrasas, unBulbasaur);
		Juego.atacar(unBrasas, unBulbasaur);
		Juego.atacar(unBrasas, unBulbasaur);  //Aca derrota a Bulbasaur
		assert ( unEntrenador.getPuntaje() == 1 );
	}
	
	@Test (expected = GanadorException.class)
	public void test62EntrenadorGanaTresPuntosYEsDeclaradoGanador() throws GanadorException{
		Entrenador unEntrenador = new Entrenador();
		Entrenador otroEntrenador = new Entrenador();
		Juego.comenzarBatalla(unEntrenador, otroEntrenador);
		unEntrenador.aumentarPuntuacion();
		unEntrenador.aumentarPuntuacion();
		unEntrenador.aumentarPuntuacion();
	}



}


