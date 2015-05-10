package Persona;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;
/**
 * - Tiene que tener un ID
 * --Tiene que ser validado por un formato (Expresion regular)
 * - Crear un algoritmo de busqueda (ID, nombre y apellidos)
 * - Formatear las entradas en los Setters (Apellidos tratar como 2 apellidos)
 * - M�s atributos = Direcci�n (Tratar la direcci�n), Telefono (tratar telefono)
 */

/**
 * @author Emmanuel Valverde Ramos
 * @version 26/04/2015 1.0
 *
 */
public class Persona
{
	//CONSTANTES
	//***********
	final static String DEF_NOMBRE = "nombre";
	final static String DEF_APELLIDOS = "apellido1 apellido2";
	final static String DEF_TELF = "655417682";
	
	//ATRIBUTOS
	//***********
	private String nombre;
	private String apellidos;
	private String telf;
	
	
	//CONSTRUCTORES
	//**************
	/**
	 * Constructor por defecto
	 */
	public Persona()
	{
		this.nombre = DEF_NOMBRE;
		this.apellidos = DEF_APELLIDOS;
		this.telf = DEF_TELF;
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param telf
	 */
	public Persona(String nombre, String apellidos, String telf) 
	{
		setNombre(nombre);
		setApellidos(apellidos);
		setTelf(telf);
	}


	/**
	 * Método constructor copia
	 * @param p Parametro de tipo persona
	 */
	public Persona(Persona p)
	{
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.telf = p.telf;
	}

	
	
	//GETTER y SETTERS
	//*****************

	//GET
	
	/**
	 * Método get de nombre
	 * @return nombre
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * Método get de apellidos 
	 * @return apellidos
	 */
	public String getApellidos() 
	{
		return apellidos;
	}
	/**
	 * Método get telf
	 * @return telf
	 */
	public String getTelf() 
	{
		return telf;
	}

	
	//SET
	
	/**
	 * Método set telf
	 * @param telf
	 */
	public void setTelf(String telf) 
	{
		if(util.Formato.formatoTelfValido(telf) == false)
		{
			this.telf = DEF_TELF;
		}
		else
		{
			this.telf = telf;
		}
	}
	
	
	/**
	 * Método set de nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) 
	{
		if(util.Formato.formatoNombreValido(nombre) == false)
		{
			this.nombre = DEF_NOMBRE;
		}
		else
		{
			this.nombre = nombre;
		}
	}

	/**
	 * Método set de apellidos
	 * @param apellidos 
	 */
	public void setApellidos(String apellidos) 
	{
		if(util.Formato.formatoApellidoValido(apellidos) == false)
		{
			this.apellidos = DEF_APELLIDOS;
		}
		else
		{
			this.apellidos = apellidos;
		}
		
	}
	//TOSTRING
	//***********
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Persona [nombre=%s, apellidos=%s, telf=%s]",
				nombre, apellidos, telf);
	}
	
	//CLONE
	//*********
	/**
	 * Método clone
	 */
	public Persona clone()
	{
		Persona p = new Persona(this.nombre, this.apellidos, this.telf);
		return p;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telf == null) ? 0 : telf.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telf == null) {
			if (other.telf != null)
				return false;
		} else if (!telf.equals(other.telf))
			return false;
		return true;
	}

	//MétodoS ABSTRACTOS
	//*******************
	/**
	 * Método abstracto
	 * @return
	 */
	public int comparator()
	{
		return 0;//Este metodo esta creado para ser implementado en las clases herederas
	}
	
	/**
	 * Método abstracto de generaci�n de id
	 */
	public String generarId()
	{
		return "generarId";
	}
	
}