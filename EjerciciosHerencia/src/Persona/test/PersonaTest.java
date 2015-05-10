package Persona.test;
import static org.junit.Assert.*;

import org.junit.Test;

import Persona.Persona;

/**
 * @author khru
 *
 */
public class PersonaTest {
	
	/**
	 * Test method for {@link Persona#Persona()}.
	 */
	@Test
	public void testPersonaConstructorPorDefecto()
	{
		System.out.println("Test constructor vacio \n");
		Persona p1 = new Persona();
		System.out.println(p1);
		assertNotNull(p1);
		System.out.println("*************************************************************\n");
	}

	/**
	 * Test method for {@link Persona#Persona(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testPersonaConstructorPorParametros() 
	{
		//Test de constructor con parametros nulos
		//*******
		System.out.println("Test de constructor con parametros nulos\n");
		Persona p1 = new Persona(null, null, null);
		//Comprobamos que no es nulo la persona que acabamos de instaciar
		assertNotNull(p1);
		System.out.println(p1 + "\n");
		//******************************************************
		System.out.println("Test de constructor con parametros vacios\n");
		Persona p5 = new Persona("", "", "");
		//Comprobamos que no es nulo la persona que acabamos de instaciar
		assertNotNull(p5);
		System.out.println(p5 + "\n");
		//******************************************************
		System.out.println("Test de constructor con parametros espacios\n");
		Persona p6 = new Persona(" ", " ", " ");
		//Comprobamos que no es nulo la persona que acabamos de instaciar
		assertNotNull(p6);
		System.out.println(p6 + "\n");
		//******************************************************
		System.out.println("Test de constructor con parametros nombre null+ apellidos\n");
		Persona p2 = new Persona(null, "Perez Rojas", "966666666");
		//Comprobamos que no es nulo la persona que acabamos de instaciar
		assertNotNull(p2);
		System.out.println(p2 + "\n");
		//******************************************************
		System.out.println("Test de constructor con parametros nombre+null\n");
		Persona p3 = new Persona("Jose", null, null);
		//Comprobamos que no es nulo la persona que acabamos de instaciar
		assertNotNull(p3);
		System.out.println(p3 + "\n");
		//******************************************************
		System.out.println("Test de constructor con parametros correctos\n");
		Persona p4 = new Persona("Jose", "Perez Rojas", "991111111");
		//Comprobamos que no es nulo la persona que acabamos de instaciar
		assertNotNull(p4);
		System.out.println(p4 + "\n");
		System.out.println("*************************************************************\n");
	}

	/**
	 * Test method for {@link Persona#Persona(Persona)}.
	 */
	@Test
	public void testPersonaConstructorCopia() 
	{
		//Test de contructor copia correcto
		//***********************************************************
		System.out.println("Test de contructor copia correcto \n");
		Persona p1 = new Persona("Jose", "Perez Rojas", "662222222");
		assertNotNull(p1);
		System.out.println(p1+ " Persona a clonar \n");
		Persona p2 = new Persona(p1);
		assertNotNull(p2);
		System.out.println(p2 + " Persona clonada \n");
		//***********************************************************
		System.out.println("Test de contructor copia todo null \n");
		Persona p3 = new Persona(null, null, null);
		assertNotNull(p3);
		System.out.println(p3+ " Persona a clonar \n");
		Persona p4 = new Persona(p3);
		assertNotNull(p4);
		System.out.println(p4 + " Persona clonada \n");
		//***********************************************************
		System.out.println("Test de contructor copia todo en blanco \"\" \n");
		Persona p5 = new Persona("", "", "");
		assertNotNull(p5);
		System.out.println(p5+ " Persona a clonar \n");
		Persona p6 = new Persona(p5);
		assertNotNull(p6);
		System.out.println(p6 + " Persona clonada \n");
		//***********************************************************
		System.out.println("Test de contructor copia todo con espacios \" \" \n");
		Persona p7 = new Persona(" ", " ", " ");
		assertNotNull(p7);
		System.out.println(p7+ " Persona a clonar \n");
		Persona p8 = new Persona(p7);
		assertNotNull(p8);
		System.out.println(p8 + " Persona clonada \n");
		
		System.out.println("*************************************************************\n");
		
	}

	/**
	 * Test method for {@link Persona#getNombre()}.
	 */
	@Test
	public void testGetNombre() 
	{
		System.out.println("Test del metodo getNombre()\n");
		System.out.println("Método getNombre todos los parametros correctos ");
		//Método toString todos los parametros correctos
		//*************************************************************
		Persona p1 = new Persona("Emmanuel", "Valverde Ramos", "993333333");
		assertNotNull(p1);
		System.out.println("El nombre es " + p1.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método getNombre todos los parametros null");
		Persona p2 = new Persona(null, null, null);
		assertNotNull(p2);
		System.out.println("El nombre es " + p2.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método getNombre todos los parametros en blanco \"\" ");
		Persona p3 = new Persona("", "", "");
		assertNotNull(p3);
		System.out.println("El nombre es " + p3.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método getNombre todos los parametros con espacio \" \" ");
		Persona p4 = new Persona(" ", " "," ");
		assertNotNull(p4);
		System.out.println("El nombre es " + p4.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método getNombre con nombre = null apellidos = \" \"");
		Persona p5 = new Persona(null, " ", "");
		assertNotNull(p5);
		System.out.println("El nombre es " + p5.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método getNombre con nombre = null apellidos = \"\"");
		Persona p6 = new Persona(null, "", " ");
		assertNotNull(p6);
		System.out.println("El nombre es " + p6.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método getNombre con nombre = \"\" apellidos = null");
		Persona p7 = new Persona("", null, " ");
		assertNotNull(p7);
		System.out.println("El nombre es " + p7.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método getNombre con nombre = \" \" apellidos = null");
		Persona p8 = new Persona(" ", null, "");
		assertNotNull(p8);
		System.out.println("El nombre es " + p8.getNombre() + "\n");
		//*************************************************************
		System.out.println("*************************************************************\n");
	}

	/**
	 * Test method for {@link Persona#getApellidos()}.
	 */
	@Test
	public void testGetApellidos() 
	{
		System.out.println("Test del metodo getApellidos()\n");
		System.out.println("Método getApellidos todos los parametros correctos ");
		//Método toString todos los parametros correctos
		//*************************************************************
		Persona p1 = new Persona("Emmanuel", "Valverde Ramos", "965555555");
		assertNotNull(p1);
		System.out.println("Los apellidos son " + p1.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método getApellidostodos los parametros null");
		Persona p2 = new Persona(null, null, null);
		assertNotNull(p2);
		System.out.println("Los apellidos son " + p2.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método getApellidos todos los parametros en blanco \"\" ");
		Persona p3 = new Persona("", "", "");
		assertNotNull(p3);
		System.out.println("Los apellidos son " + p3.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método getApellidos todos los parametros con espacio \" \" ");
		Persona p4 = new Persona(" ", " "," ");
		assertNotNull(p4);
		System.out.println("Los apellidos son " + p4.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método getApellidos con nombre = null apellidos = \" \"");
		Persona p5 = new Persona(null, " ", " ");
		assertNotNull(p5);
		System.out.println("Los apellidos son " + p5.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método getApellidos con nombre = null apellidos = \"\"");
		Persona p6 = new Persona(null, "", "");
		assertNotNull(p6);
		System.out.println("Los apellidos son " + p6.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método getApellidos con nombre = \"\" apellidos = null");
		Persona p7 = new Persona("", null, null);
		assertNotNull(p7);
		System.out.println("Los apellidos son " + p7.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método getApellidos con nombre = \" \" apellidos = null");
		Persona p8 = new Persona(" ", null, "");
		assertNotNull(p8);
		System.out.println("Los apellidos son " + p8.getApellidos() + "\n");
		//*************************************************************
		System.out.println("*************************************************************\n");
	}

	/**
	 * Test method for {@link Persona#setNombre(java.lang.String)}.
	 */
	@Test
	public void testSetNombre()
	{
		System.out.println("Test del metodo setNombre()\n");
		System.out.println("Método setNombre todos los parametros correctos ");
		//Método toString todos los parametros correctos
		//*************************************************************
		Persona p1 = new Persona();
		assertNotNull(p1);
		p1.setNombre("Persona");
		assertEquals(p1.getNombre(), "Persona");
		System.out.println("El nombre es " + p1.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método setNombre todos los parametros null");
		Persona p2 = new Persona(null, null, null);
		assertNotNull(p2);
		System.out.println("El nombre es " + p2.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método setNombre todos los parametros en blanco \"\" ");
		Persona p3 = new Persona("", "", "");
		assertNotNull(p3);
		System.out.println("El nombre es " + p3.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método setNombre todos los parametros con espacio \" \" ");
		Persona p4 = new Persona(" ", " ", " ");
		assertNotNull(p4);
		System.out.println("El nombre es " + p4.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método setNombre con nombre = null apellidos = \" \"");
		Persona p5 = new Persona(null, " ", " ");
		assertNotNull(p5);
		System.out.println("El nombre es " + p5.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método setNombre con nombre = null apellidos = \"\"");
		Persona p6 = new Persona(null, "", "");
		assertNotNull(p6);
		System.out.println("El nombre es " + p6.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método setNombre con nombre = \"\" apellidos = null");
		Persona p7 = new Persona("", null, null);
		assertNotNull(p7);
		System.out.println("El nombre es " + p7.getNombre() + "\n");
		//*************************************************************
		System.out.println("Método setNombre con nombre = \" \" apellidos = null");
		Persona p8 = new Persona(" ", null, null);
		assertNotNull(p8);
		System.out.println("El nombre es " + p8.getNombre() + "\n");
		//*************************************************************
		System.out.println("*************************************************************\n");
	}

	/**
	 * Test method for {@link Persona#setApellidos(java.lang.String)}.
	 */
	@Test
	public void testSetApellidos() 
	{
		System.out.println("Test del metodo setApellidos()\n");
		System.out.println("Método setApellidos persona1");
		//Método toString todos los parametros correctos
		//*************************************************************
		Persona p1 = new Persona();
		assertNotNull(p1);
		p1.setApellidos("Persona Uno");
		assertEquals(p1.getApellidos(), "Persona Uno");
		System.out.println("Los apellidos son " + p1.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método setApellidos persona2");
		Persona p2 = new Persona();
		assertNotNull(p2);
		p2.setApellidos("Persona Dos");
		assertEquals(p2.getApellidos(), "Persona Dos");
		System.out.println("Los apellidos son " + p2.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método setApellidos persona3");
		Persona p3 = new Persona("", "", "");
		assertNotNull(p3);
		p3.setApellidos("Persona Tres");
		assertEquals(p3.getApellidos(), "Persona Tres");
		System.out.println("Los apellidos son " + p3.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método setApellidos persona4");
		Persona p4 = new Persona(" ", " ", " ");
		assertNotNull(p4);
		p4.setApellidos("Persona Cuatro");
		assertEquals(p4.getApellidos(), "Persona Cuatro");
		System.out.println("Los apellidos son " + p4.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método setApellidos persona5");
		Persona p5 = new Persona(null, " ", " ");
		assertNotNull(p5);
		p5.setApellidos("Persona Cinco");
		assertEquals(p5.getApellidos(), "Persona Cinco");
		System.out.println("Los apellidos son " + p5.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método setApellidos persona6");
		Persona p6 = new Persona(null, "", "");
		assertNotNull(p6);
		p6.setApellidos("Persona Seis");
		assertEquals(p6.getApellidos(), "Persona Seis");
		System.out.println("Los apellidos son " + p6.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método setApellidos persona7");
		Persona p7 = new Persona("", null, null);
		assertNotNull(p7);
		p7.setApellidos("Persona Siete");
		assertEquals(p7.getApellidos(), "Persona Siete");
		System.out.println("Los apellidos son " + p7.getApellidos() + "\n");
		//*************************************************************
		System.out.println("Método setApellidos persona8");
		Persona p8 = new Persona(" ", null, null);
		assertNotNull(p8);
		p8.setApellidos("Persona Ocho");
		assertEquals(p8.getApellidos(), "Persona Ocho");
		System.out.println("Los apellidos son " + p8.getApellidos() + "\n");
		//*************************************************************
		System.out.println("*************************************************************\n");	
	}

	/**
	 * Test method for {@link Persona#toString()}.
	 */
	@Test
	public void testToString() 
	{
		System.out.println("Test del metodo toString() \n");
		System.out.println("Método toString todos los parametros correctos ");
		//Método toString todos los parametros correctos
		//*************************************************************
		Persona p1 = new Persona("Emmanuel", "Valverde Ramos", "665555555");
		assertNotNull(p1);
		System.out.println(p1 + "\n");
		//*************************************************************
		System.out.println("Método toString todos los parametros null");
		Persona p2 = new Persona(null, null, null);
		assertNotNull(p2);
		System.out.println(p2 + "\n");
		//*************************************************************
		System.out.println("Método toString todos los parametros en blanco \"\" ");
		Persona p3 = new Persona("", "", "");
		assertNotNull(p3);
		System.out.println(p3 + "\n");
		//*************************************************************
		System.out.println("Método toString todos los parametros con espacio \" \" ");
		Persona p4 = new Persona(" ", " ", " ");
		assertNotNull(p4);
		System.out.println(p4 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = null apellidos = \" \"");
		Persona p5 = new Persona(null, " ", "");
		assertNotNull(p5);
		System.out.println(p5 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = null apellidos = \"\"");
		Persona p6 = new Persona(null, "", " ");
		assertNotNull(p6);
		System.out.println(p6 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = \"\" apellidos = null");
		Persona p7 = new Persona("", null," ");
		assertNotNull(p7);
		System.out.println(p7 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = \" \" apellidos = null");
		Persona p8 = new Persona(" ", null, "");
		assertNotNull(p8);
		System.out.println(p8 + "\n");
		//*************************************************************
		System.out.println("*************************************************************\n");
	}

	/**
	 * Test method for {@link Persona#clone()}.
	 */
	@Test
	public void testClone() 
	{
		System.out.println("Test del metodo clone\n");
		//Método clone todos los parametros correctos
		//*************************************************************
		System.out.println("Test del metodo clone todo correcto\n");
		Persona p = new Persona("Emmanuel", "Valverde Ramos", "955555555");
		assertNotNull(p);
		System.out.println("Objeto a clonar " + p + "\n");
		Persona p1 = p.clone();
		assertNotNull(p1);
		System.out.println("Objeto clonado " + p1 + "\n");
		//Método clone todo null
		//*************************************************************
		System.out.println("Test del metodo clone todo null\n");
		Persona p2 = new Persona(null, null, null);
		assertNotNull(p2);
		System.out.println("Objeto a clonar " + p2 + "\n");
		Persona p3 = p2.clone();
		assertNotNull(p3);
		System.out.println("Objeto clonado " + p3 + "\n");
		//Método clone nombre incorrecto
		//*************************************************************
		System.out.println("Test del metodo clone nombre = \"\" + apellidos = null\n");
		Persona p4 = new Persona("", null, null);
		assertNotNull(p4);
		System.out.println("Objeto a clonar " + p4 + "\n");
		Persona p5 = p4.clone();
		assertNotNull(p5);
		System.out.println("Objeto clonado " + p5 + "\n");
		//*************************************************************
		System.out.println("Test del metodo clone nombre = null + apellidos \"\"\n");
		Persona p6 = new Persona(null , "", " ");
		assertNotNull(p6);
		System.out.println("Objeto a clonar " + p6 + "\n");
		Persona p7 = p6.clone();
		assertNotNull(p7);
		System.out.println("Objeto clonado " + p7 + "\n");
		//*************************************************************
		System.out.println("Test del metodo clone nombre = null + apellidos \"\"\n");
		Persona p8 = new Persona(null , "","");
		assertNotNull(p8);
		System.out.println("Objeto a clonar " + p8 + "\n");
		Persona p9 = p8.clone();
		assertNotNull(p9);
		System.out.println("Objeto clonado " + p9 + "\n");
		//*************************************************************
		System.out.println("Test del metodo clone nombre = null + apellidos \" \"\n");
		Persona p10 = new Persona(null , " ", " ");
		assertNotNull(p10);
		System.out.println("Objeto a clonar " + p10 + "\n");
		Persona p11 = p10.clone();
		assertNotNull(p11);
		System.out.println("Objeto clonado " + p11 + "\n");
		
		System.out.println("*************************************************************\n");
	}
	
	/**
	 * Test method for {@link Persona#setTelef()}.
	 */
	@Test
	public void testSetTelf() 
	{
		System.out.println("Test del metodo setTelef() \n");
		System.out.println("Método toString todos los parametros correctos ");
		//Método toString todos los parametros correctos
		//*************************************************************
		Persona p1 = new Persona("Emmanuel", "Valverde Ramos", "665555555");
		assertNotNull(p1);
		System.out.println(p1 + "\n");
		//*************************************************************
		System.out.println("Método toString todos los parametros null");
		Persona p2 = new Persona(null, null, null);
		assertNotNull(p2);
		System.out.println(p2 + "\n");
		//*************************************************************
		System.out.println("Método toString todos los parametros en blanco \"\" ");
		Persona p3 = new Persona("", "", "");
		assertNotNull(p3);
		System.out.println(p3 + "\n");
		//*************************************************************
		System.out.println("Método toString todos los parametros con espacio \" \" ");
		Persona p4 = new Persona(" ", " ", " ");
		assertNotNull(p4);
		System.out.println(p4 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = null apellidos = \" \"");
		Persona p5 = new Persona(null, " ", "");
		assertNotNull(p5);
		System.out.println(p5 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = null apellidos = \"\"");
		Persona p6 = new Persona(null, "", " ");
		assertNotNull(p6);
		System.out.println(p6 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = \"\" apellidos = null");
		Persona p7 = new Persona("", null," ");
		assertNotNull(p7);
		System.out.println(p7 + "\n");
		//*************************************************************
		System.out.println("Método toString con nombre = \" \" apellidos = null");
		Persona p8 = new Persona(" ", null, "");
		assertNotNull(p8);
		System.out.println(p8 + "\n");
		//*************************************************************
		System.out.println("*************************************************************\n");
	}

}