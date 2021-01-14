/**
 * Ejercicio práctico examen Eval 1 ED
 * 
 * @author STEPHANIE BADAL DNI 55272278N
 * @version 1.0
 */
public class AnalistaED_55272278N {
	static final double FACTOR_HORA_EXTRA = 1.2;
	private String nombreCompleto, dni;
	private double salarioBasePorHora = 10.56;
	
	/**
	 * Constructor con tres parámetros
	 * 
	 * @param nombre nombre completo en mayúsculas
	 * @param dni documento nacional de identidad con letra sin espacios
	 */
	public AnalistaED_55272278N(String nombre, String dni) {
		this.nombreCompleto = nombre;
		this.dni = dni;
	}
	
	public double getSalarioEsteMes(int horasExtra) {
		double cantidadExtra, salarioFinal;
		cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
		salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
		
		return salarioFinal;
	}
	
	public static void main(String[] args) {
		AnalistaED_55272278N emp = new AnalistaED_55272278N("STEPHANIE PEREZ", "55272278N");
		int horasExtra = 2;
		
		System.out.println("El salario de "+ emp.nombreCompleto + " este mes será de "+ emp.getSalarioEsteMes(horasExtra) + " euros, al hacer "+ horasExtra + " horas extra.");
	}
	
}
