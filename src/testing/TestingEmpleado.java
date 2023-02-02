package testing;

import model.javabean.Departamento;
import model.javabean.Empleado;
import model.javabean.Localidad;
import model.javabean.Trabajo;

public class TestingEmpleado {

	public static void main(String[] args) {
		Localidad loc = new Localidad(94, "Carrer de Quart", "València", "España");
		Departamento dep = new Departamento(7, "Marketing", loc);
		Trabajo job = new Trabajo("27M", "SEO", 50000, 80000);
		Empleado empl = new Empleado(22, "Carolina", "Brazales Sempere", "cbs@gmail.com", 'M', 30000,
				8000, job, dep);
		
		
		System.out.println(
				empl.getNombre() + " " + 
				empl.getApellidos() + " " + 
				empl.getGenero() + " " + 
		        empl.getDepartamento().getDescripcion() + " " + 
				empl.getTrabajo().getDescripcion() + " " + 
				empl.getDepartamento().getLocalidad().getCiudad() + " " +
		        empl.getDepartamento().getLocalidad().getPais());
	}
}


