package model.dao;

import java.util.ArrayList;

import model.javabean.Departamento;
import model.javabean.Empleado;
import model.javabean.Localidad;
import model.javabean.Trabajo;


	public class Empresa implements IntGestEmpresaDao{
		private String nombre;
		private ArrayList<Empleado> listaEmpleados;
		
		
		Trabajo job = new Trabajo("28M", "IT", 70000, 80000);
		Localidad loc = new Localidad(26, "Calle Ausias March", "Xàtiva", "España");
		Departamento dep = new Departamento(9, "Informática",loc );
		
		
		
		public Empresa(String nombre) {
			super();
			this.nombre = nombre;
			listaEmpleados = new ArrayList<>();
			cargarDatos();
		}
		
		private void cargarDatos() {
			listaEmpleados.add(new Empleado(22, 
					"Carolina", 
					"Brazales Sempere", 
					"cbs@gmail.com", 'M', 30000,
					8000, 
					job, 
					dep));
			
			listaEmpleados.add(new Empleado(28, 
					"Ramón", "Soler", "rmn@gmail.com", 'H', 23000, 40000, job, dep));
			
			listaEmpleados.add(new Empleado(20, 
					"Saioa", "Rodríguez", "saio@gmail.com", 'M', 29000, 40000, job, dep));
			
		}

		
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		@Override
		public boolean alta(Empleado empleado) {
			if(listaEmpleados.contains(empleado)) {
				return false;
			} else {
				return listaEmpleados.add(empleado);
			}
		}

		@Override
		public boolean eliminarUno(Empleado empleado) {
			return listaEmpleados.remove(empleado);
		}

		@Override
		public boolean modificarUno(Empleado empleado) {
			int position = listaEmpleados.indexOf(empleado);
			
			if(position == -1)
				return false;
			
			else 
				listaEmpleados.set(position, empleado);
			return true;
		}

		@Override
		public ArrayList<Empleado> buscarPorGenero() {
			
			//TODO
			return null;
		}

		@Override
		public Empleado buscarUno(int idEmpleado) {
			Empleado empl = new Empleado();
			empl.setIdEmpleado(idEmpleado);
			int posicion = listaEmpleados.indexOf(empl);
			
			if(posicion == -1)
				return null;
			return listaEmpleados.get(posicion);		}

		@Override
		public ArrayList<Empleado> buscarTodos() {
			return listaEmpleados;
		}

		@Override
		public double masaSalarial() {
			
			double salarioTotal = 0;
			for(Empleado empleado: listaEmpleados) {
				salarioTotal += empleado.salarioBruto();
			}
			
			return salarioTotal;
		}

		@Override
		public ArrayList<Empleado> buscarPorDepartamento(int idDepartamento) {
			ArrayList<Empleado> empleadosAux = new ArrayList<>();
			
			for(Empleado empleado: listaEmpleados) {
				if(empleado.getDepartamento().getIdDepar() == idDepartamento) {
					empleadosAux.add(empleado);
				}
			}
			     return empleadosAux;
		}

		@Override
		public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
			ArrayList<Empleado> empleadosAux = new ArrayList<>();
			
			for(Empleado empleado: listaEmpleados) {
				if(empleado.getTrabajo().getIdTrabajo().equalsIgnoreCase(idTrabajo)) {
					empleadosAux.add(empleado);
				}
			}
			     return empleadosAux;
		}

		@Override
		public ArrayList<Empleado> buscarPorPais(String pais) {
			ArrayList<Empleado> empleadosAux = new ArrayList<>();
			
			for(Empleado empleado: listaEmpleados) {
				if(empleado.getDepartamento().getLocalidad().getPais().equalsIgnoreCase(pais)) {
					empleadosAux.add(empleado);
				}
			}
			     return empleadosAux;
		}
		
		
}
