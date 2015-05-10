/**
 * 
 */
package Persona;

import java.util.GregorianCalendar;
import java.util.regex.Pattern;

/**
 * @author khru
 *
 */
public class Estudiante extends Persona
{
	//CONSTANTES
	//***********
	private static final double EVALUACION = 5;
	//Este ID es creado solo para su uso en debugging
	private static final String ID_ESTUDIANTE = "AAA000";
	//ATRIBUTOS
	//*********
	private double evaluacion;
	
	//Atriuto añadido para mayor dificultad
	private GregorianCalendar fechaNacimiento;
	private String idEstudiante;
	
	
	//CONSTRUCTORES
	//**************
	
	/**
	 * Método constructor por defecto
	 */
	public Estudiante() 
	{
		super();
		this.idEstudiante = generarId();
		this.evaluacion = EVALUACION;
		this.fechaNacimiento = new GregorianCalendar();
	}

	/**
	 * Método constructor con parametros
	 * @param n
	 * @param a
	 */
	public Estudiante(String nombre, String apellidos, String telf, int evaluacion, GregorianCalendar fechaNacimiento) 
	{
		super(nombre, apellidos, telf);
		setEvaluacion(evaluacion);
		setFechaNacimiento(fechaNacimiento);
		generarId();
	}
	
	/**
	 * Método constructor copia
	 * @param p
	 */
	public Estudiante(Persona p) 
	{
		super(p);
		this.evaluacion = EVALUACION;
		this.fechaNacimiento = new GregorianCalendar(1992,06,9);
		this.idEstudiante = generarId();
		
		
	}
	//GETTERS Y SETTERS
	//*****************

	//GET----------------------------------------------------
	/**
	 * @return the evaluación
	 */
	public double getEvaluaion()
	{
		return evaluacion;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public GregorianCalendar getFechaNacimiento() 
	{
		return fechaNacimiento;
	}

	/**
	 * @return the idEstudiante
	 */
	public String getIdEstudiante() 
	{
		return idEstudiante;
	}
	
	//SET----------------------------------------------------
	/**
	 * @param evaluacion the evaluación to set
	 */
	public void setEvaluacion(double evaluacion) 
	{
		//Comprobamos que la nota es valida
		if(evaluacion < 0 || evaluacion > 10)
		{
			this.evaluacion = EVALUACION;
		}
		else
		{
			this.evaluacion = evaluacion;
		}
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(GregorianCalendar fechaNacimiento) 
	{
		this.fechaNacimiento = fechaNacimiento;
	}

	//idEstudiante no tiene setter
	
	/**
	 * Método que genera el ID 
	 */
	public String generarId()
	{
		StringBuilder id = new StringBuilder();
		id.append(this.getNombre().toUpperCase().charAt(0));
		id.append(this.getNombre().toUpperCase().charAt(1));
		id.append(this.getNombre().toUpperCase().charAt(2));
		id.append(this.getTelf().charAt(0));
		id.append(this.getTelf().charAt(1));
		id.append(this.getTelf().charAt(2));
		//Comprobar el formato del id
		if(util.Formato.formatoIdValido(id.toString()) == false)
		{
			//Devolucion de ID_INVALIDO para poder debuggearlo (nunca llegará aqui porque los set de nombre
			//y apellido gestionan la validez)
			return "ID_INVALIDO";
		}
		//return ID_VALIDO
		return id.toString();
	}
	
	/**
	 * Resetea el id de forma que cuando e nombre o el telefono se actualicen el ID también lo haga
	 */
	public void resetarIdEstudiante()
	{
		this.idEstudiante = generarId();
	}
	//OVERRIDE métodos del padre
	//***************************
	
	@Override
	/**
	 * Método SetNombre que sobreescribe el de la clase padre
	 * @param nombre
	 */
	public void setNombre(String nombre)
	{
		super.setNombre(nombre);
		resetarIdEstudiante();
	}
	
	@Override
	/**
	 * Método SetNombre que sobreescribe el de la clase padre
	 * @param nombre
	 */
	public void setTelf(String telf)
	{
		super.setTelf(telf);
		resetarIdEstudiante();
	}
	
	//toString()
	//*************
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String
				.format("Estudiante [idEstudiante=%s, evaluacion=%s, nombre=%s, apellidos=%s fechaNacimiento=%s]",
						idEstudiante, evaluacion, super.getNombre(), super.getApellidos(), fechaNacimiento);
	}

	public static void main(String[] args)
	{
		Estudiante e = new Estudiante();
		System.out.println(e);
		e.setNombre("Emm");
		System.out.println(e);
		e.setTelf("966666666");
		System.out.println(e);
		e.setEvaluacion(8);
		System.out.println(e);
		System.out.println(e.hashCode());
	}
	
}
