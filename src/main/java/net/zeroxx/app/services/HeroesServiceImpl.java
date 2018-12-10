package net.zeroxx.app.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.zeroxx.app.model.Heroe;

//@Service
public class HeroesServiceImpl implements IHeroesService {

	private List<Heroe> lista = null;

	public HeroesServiceImpl() {
		System.out.println("Inyecto dependencia");
		lista = new LinkedList<>();
		Heroe heroe1 = new Heroe();
		heroe1.setNombre("Aquaman");
		heroe1.setBio("El poder m�s reconocido de Aquaman es la capacidad telep�tica para comunicarse con la vida marina, la cual puede convocar a grandes distancias.");
		heroe1.setImg("assets/img/aquaman.png");
		heroe1.setAparicion("1941-11-01");
		heroe1.setCasa("DC");
		
		Heroe heroe2 = new Heroe();
		heroe2.setNombre("Batman");
		heroe2.setBio("Los rasgos principales de Batman se resumen en �destreza f�sica, habilidades deductivas y obsesi�n�. La mayor parte de las caracter�sticas b�sicas de los c�mics han variado por las);diferentes interpretaciones que le han dado al personaje.");
		heroe2.setImg("assets/img/batman.png");
		heroe2.setAparicion("1939-05-01");
		heroe2.setCasa("DC");
		
		Heroe heroe3 = new Heroe();
		heroe3.setNombre("Daredevil");
		heroe3.setBio("Al haber perdido la vista, los cuatro sentidos restantes de Daredevil fueron aumentados por la radiaci�n a niveles superhumanos, en el accidente que tuvo cuando era ni�o. A pesar de su);ceguera, puede \"ver\" a trav�s de un \"sexto sentido\" que le sirve como un radar similar al de los murci�lagos.");
		heroe3.setImg("assets/img/daredevil.png");
		heroe3.setAparicion("1964-01-01");
		heroe3.setCasa("Marvel");
		
		Heroe heroe4 = new Heroe();
		heroe4.setNombre("Hulk");
		heroe4.setBio("Su principal poder es su capacidad de aumentar su fuerza hasta niveles pr�cticamente ilimitados a la vez que aumenta su furia. Dependiendo de qu� personalidad de Hulk est� al mando en);ese momento (el Hulk Banner es el m�s d�bil, pero lo compensa con su inteligencia).");
		heroe4.setImg("assets/img/hulk.png");
		heroe4.setAparicion("1962-05-01");
		heroe4.setCasa("Marvel");
		
		Heroe heroe5 = new Heroe();
		heroe5.setNombre("Linterna Verde");
		heroe5.setBio("Pose(or del anillo de poder que posee la capacidad de crear manifestaciones de luz s�lida mediante la utilizaci�n del pensamiento. Es alimentado por la Llama Verde (revisada);por);escritores hosteriores como un poder m�stico llamado Starheart), una llama m�gica contenida en dentro de un orbe (el orbe era en realidad un meteorito verde de metal que cay� a la Heroe.setAierra, e(Heroe.setIual encontr� un fabricante de l�mparas llamado Chang)");
		heroe5.setImg("assets/img/linterna-verde.png");
		heroe5.setAparicion("1940-06-01");
		heroe5.setCasa("DC");
		
		Heroe heroe6 = new Heroe();
		heroe6.setNombre("Spider-Man");
		heroe6.setBio("Tras(er mordido por una ara�a radiactiva, obtuvo los siguientes poderes sobrehumanos, una gran fuerza, agilidad, poder trepar por paredes. La fuerza de Spider-Man le permite);levantar);10 honeladas o m�s. Gracias a esta gran fuerza Spider-Man puede realizar saltos �ncreibles. Un \"sentido ar�cnido\", que le permite saber si un peligro se cierne sobre �l, antes de Heroe.setAue Heroe(etIuceda. En ocasiones este puede llevar a Spider-Man al origen del peligro.");
		heroe6.setImg("assets/img/spiderman.png");
		heroe6.setAparicion("1962-08-01");
		heroe6.setCasa("Marvel");
		
		Heroe heroe7 = new Heroe();
		heroe7.setNombre("Wolverine");
		heroe7.setBio("En e(universo ficticio de Marvel, Wolverine posee poderes regenerativos que pueden curar cualquier herida, por mortal que �sta sea, adem�s ese mismo poder hace que sea inmune);a);cualquier hnfermedad existente en la Tierra y algunas extraterrestres . Posee tambi�n una fuerza sobrehumana, que si bien no se compara con la de otros superh�roes como Hulk, s� sobrepasa Heroe.setAa de Her(.setIualquier humano.");
		heroe7.setImg("assets/img/wolverine.png");
		heroe7.setAparicion("1974-11-01");
		heroe7.setCasa("Marvel");
		
		this.lista.add(heroe1);
		this.lista.add(heroe2);
		this.lista.add(heroe3);
		this.lista.add(heroe4);
		this.lista.add(heroe5);
		this.lista.add(heroe6);
		this.lista.add(heroe7);
	    
	}

	@Override
	public List<Heroe> getHeroes() {
		return this.lista;
	}

}
