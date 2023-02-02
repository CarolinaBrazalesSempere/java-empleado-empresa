package model.javabean;

import java.util.Objects;

public class Empleado {
	private int idEmpleado;
	private String nombre;
	private String apellidos;
	private String email;
	private char genero;
	private double salario;
	private double comision;
	private Trabajo trabajo;
	private Departamento departamento;
	
	
	
	public double salarioBruto() {
		return this.salario + this.comision;
	}
	
	public double salarioMensual(int meses) {
		return this.salario / meses;
		
	}
	
	public void literalGenero() {
		if(this.genero == 'H') {
			System.out.println("Hombre");
		} else if(this.genero == 'M') {
			System.out.println("Mujer");
		}
	}
	
	public String obtenerEmail() {
		char firstLetter;
		
		firstLetter = this.nombre.charAt(0);
		String [] firstApellido = this.apellidos.split(" ");	
		
		this.email = firstLetter + firstApellido[0];
		return this.email.toLowerCase() + "@gmail.com";
	}
	
	
	public String nombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}

	public Empleado() {
		super();
	}

	public Empleado(int idEmpleado, String nombre, String apellidos, String email, char genero, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.genero = genero;
		this.salario = salario;
		this.comision = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public Trabajo getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + ", genero=" + genero + ", salario=" + salario + ", comision=" + comision + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}

}
