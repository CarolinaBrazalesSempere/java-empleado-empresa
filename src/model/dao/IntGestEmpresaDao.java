package model.dao;

import java.util.ArrayList;

import model.javabean.Empleado;

public interface IntGestEmpresaDao {
	boolean alta(Empleado empleado);
	boolean eliminarUno(Empleado empleado);
	boolean modificarUno(Empleado empleado);
	ArrayList<Empleado> buscarPorGenero();
	Empleado buscarUno(int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	double masaSalarial();
	ArrayList<Empleado> buscarPorDepartamento(int idDepartamento);
	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);
	

}
