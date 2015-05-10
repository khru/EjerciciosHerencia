/**
 * @author Emmanuel Valverde Ramos
 * @version 26/04/2015 1.0
 * Libreria de formatos validos 
 */
package util;

import java.util.regex.Pattern;

public class Formato 
{
	//Nombre y Apellidos(3) o Nombre compuesto
	private static final String NOMBRE_COMPUESTO_3 = "^(\\p{L}){3,} (\\p{L}){2,} (\\p{L}){2,}";
	private static final String NOMBRE_COMPUESTO_2 = "^(\\p{L}){3,} (\\p{L}){2,}";
	private static final String NOMBRE = "^[A-Z������][a-z������]{2,}";
	private static final String APELLIDOS = "^[A-Z������](\\p{L}){2,} [A-Z������](\\p{L}){2,}";
	private static final String APELLIDO = "^[A-Z������][a-z������]{2,}";
	private static final String APELLIDOS_COMPUESTOS = "^[A-Z������]((([-])(\\p{L}+))|((\\p{L}+ )((de)(( la)?))( \\p{L}+)))?";
	
	private static final String IDPROVEEDOR = "[A-Z������]{3}[0-9]{3}";
	
	private static final String TELEFONO = "^\\+?\\d{1,3}?[ ]?\\(?\\d{2,3}\\)?[ ]?\\d\\d\\d[ ]?\\d\\d\\d$";
	private static final String CORREOE = "^[a-zA-Z0-9-_.\\w]{4,}@[a-z]{4,}.[a-z]{3,}";
	private static final String MOVIL_ESPAÑA = "^6[0-9]{8}$";
	private static final String TELEFONO_FIJO = "^9[0-9]{8}$";
	private static final String DNI = "^[0-9]{8}[A-Z]$";
	
	//Formatos de Agustin
	
	private static final String PATRON_URL = "^http://[\\w]+(\\.[\\w-]+)*/([\\w-])*/([\\w-]+)*(\\.[\\w]{1,})";
	private static final String PATRON_URL2 = "^(https?://)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\w\\.-/]+)?/?$";
	private static final String PATRON_URL3 = "^(ht|f)tp(s?)://[0-9a-zA-Z]([-\\.\\w]*[0-9a-zA-Z])*(?:(0-9)*)*(?)([a-zA-Z0-9-\\.?,/+&%\\$#_]*)?$";
	private static final String PATRON_ID_YOOTUBE = "^http://(?:youtu\\.be/|(?:[a-z]{2,3}\\.)?youtube\\.com/watch(?:\\?|#\\!)v=)([\\w-]{11}).*/gi";
	private static final String PATRON_CORREO = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3})$";
	private static final String PATRON_USUARIO = "^[a-z\\d_]{4,15}$";
	private static final String PATRON_CONTRASEÑA = "[A-Z�a-z�0-9%&#_-]{6,18}";
	private static final String PATRON_CONTRASEÑA2 = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
	private static final String PATRON_CONTRASEÑA3 = "((?=.{0,}[A-Z�])(?=.{0,}[a-z�])(?=.{1,}\\d)(?=.{1,}[$*-+&!?%])).{8,16}";
	private static final String PATRON_CONTRASEÑ4 = "^(?=[^\\d_].*?\\d)\\w(\\w|[!@#$%]){7,20}";
	private static final String PATRON_TELEFONO = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
	private static final String PATRON_CP = "^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String PATRON_NIF = "^[0-9]{8}[a-zA-Z]";
	private static final String PATRON_ID = "^[A-Z�]{3}[0-9]{2}[A-Z]";
	private static final String PATRON_TARJETA = "^((67\\d{2})|(4\\d{3})|(5[1-5]\\d{2})|(6011))(-?\\s?\\d{4}){3}|(3[4,7])\\d{2}-?\\s?\\d{6}-?\\s?\\d{5}$";
	private static final String PATRON_IP = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
	private static final String PATRON_IP2 = "^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
	private static final String PATRON_IP3 = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))";
	
	/**
	 * M�todo de validaci�n de apellidos
	 * @param apellido
	 * @return true Si el apellido es valido
	 * @return false si el apellido es erroneo
	 */
	public static boolean formatoApellidoValido(String apellido)
	{
		if(apellido == null)
		{
			return false;
		}
		else
		{
			if(Pattern.compile(APELLIDOS_COMPUESTOS).matcher(apellido).matches() 
				|| Pattern.compile(APELLIDOS).matcher(apellido).matches() 
				|| Pattern.compile(APELLIDO).matcher(apellido).matches() )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	/**
	 * 
	 * @param nombre
	 * @return true Si el apellido es valido
	 * @return false si el apellido es erroneo
	 */
	public static boolean formatoNombreValido(String nombre)
	{
		if(nombre == null)
		{
			return false;
		}
		else
		{
			if(Pattern.compile(NOMBRE_COMPUESTO_3).matcher(nombre).matches() 
				|| Pattern.compile(NOMBRE_COMPUESTO_2).matcher(nombre).matches()
				|| Pattern.compile(NOMBRE).matcher(nombre).matches())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return true Si el apellido es valido
	 * @return false si el apellido es erroneo
	 */
	public static boolean formatoIdValido(String id)
	{
		if(id == null)
		{
			return false;
		}
		else
		{
			if(Pattern.compile(IDPROVEEDOR).matcher(id).matches())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	public static boolean formatoTelfValido(String telf)
	{
		if(telf == null)
		{
			return false;
		}
		else
		{
			if(Pattern.compile(MOVIL_ESPAÑA).matcher(telf).matches() || Pattern.compile(TELEFONO_FIJO).matcher(telf).matches())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	public static void main(String[] args)
	{
//		String apellido = "Quijo�e de la Mancha";
//		String apellido1 = "Cortazar Perez";
//		String apellidonull = "";
//		String apellido2 = "Apellido";
//		System.out.println(formatoApellidoValido(apellido));
//		System.out.println(formatoApellidoValido(apellido1));
//		System.out.println(formatoApellidoValido(apellidonull));
//		System.out.println(formatoApellidoValido(apellido2));
		
//		
//		String nombre = "Quijo�e Mancha";
//		String nombre1 = "Cortazar perez";
//		String nombrenull = "";
//		String nombre2 = "Nombre";
//		String nombre3 = "Eva";
//		System.out.println(formatoNombreValido(nombre));
//		System.out.println(formatoNombreValido(nombre1));
//		System.out.println(formatoNombreValido(nombrenull));
//		System.out.println(formatoNombreValido(nombre2));
//		System.out.println(formatoNombreValido(nombre3));
//		
//		String id = "ABC012";
//		System.out.println(formatoIdValido(id));
		
//		String telf = "655417682";
//		String telf1 = "965417682";
//		String telf2 = "96541768";
//		System.out.println(formatoTelfValido(telf));
//		System.out.println(formatoTelfValido(telf1));
//		System.out.println(formatoTelfValido(telf2));
	}

}

