package testing;

import model.dao.Empresa;
import model.javabean.Departamento;
import model.javabean.Empleado;
import model.javabean.Localidad;
import model.javabean.Trabajo;

public class Principal {

	public static void main(String[] args) {
        Empresa miempresa = new Empresa("Digital Menta");
        Trabajo job2 = new Trabajo("24M", "PPC", 70000, 44444);
        Localidad loc = new Localidad(90, "Bahnstrasse, 7", "Hamburg", "Alemania");
        Departamento dep2= new Departamento(7,"Marketing", loc );
		
        //Test método probar todos
        System.out.println("Find all");
		for(Empleado ele: miempresa.buscarTodos()) {
			System.out.println(ele);
		}
		
		//Test método dar de alta un empleado
		System.out.println("Alta Empleada");
		Empleado empl3 = new Empleado(34, "Sara", "González", "sg@gd", 'M', 1321,1231, job2, dep2);
		Empleado emplPrueba = new Empleado(28, "Ramón", "Soler", "rmn@gmail.com", 'H', 23000, 40000, job2, dep2);
		
		System.out.println(miempresa.alta(empl3));
		System.out.println(miempresa.alta(emplPrueba));
		
		//Test método eliminar un empleado
		System.out.println("Eliminar uno");
		System.out.println(miempresa.eliminarUno(emplPrueba));
		System.out.println("Lista actualizada");
		for(Empleado ele: miempresa.buscarTodos()) {
			System.out.println(ele);
		}
		
		//Test método modificar un empleado
		System.out.println("Modificar un empleado");
		Empleado empl4 = new Empleado(34, "Eugenia", "González", "euge@gd", 'M', 1321,1231, job2, dep2);
		System.out.println(miempresa.modificarUno(empl4));
		
		System.out.println("Lista empleados con modificación");
		for(Empleado ele: miempresa.buscarTodos()) {
			System.out.println(ele);
		}
		
		//Test método buscar un empleado
		System.out.println("Buscar uno");
		System.out.println(miempresa.buscarUno(34));
		
		//Test método buscar empleado por id trabajo
		System.out.println("Buscar por trabajo");
		String idTrabajo = "28M";
		for(Empleado empleados: miempresa.buscarPorTrabajo(idTrabajo)) {
			System.out.println(empleados);
		}
		
		//Test método buscar empleado por país
		System.out.println("Buscar por país");
		String pais = "Alemania";
		for(Empleado empleados: miempresa.buscarPorPais(pais)) {
			System.out.println(empleados);
		}
		
		
		//Test método buscar por ID de departamento
		System.out.println("Buscar por ID de departamento");
		int numDepartamento = 7;
		for(Empleado empleados: miempresa.buscarPorDepartamento(numDepartamento)) {
			System.out.println(empleados);
		}
		
		System.out.println(miempresa.masaSalarial());
	}

}
