package escuelaIdiomas;

public class Alumno {
	private int numMatricula;
	private String nombre;
	private String direccion;
	private Asignatura asignatura;
	private double nota;
	private Centro centro;
	
	public Alumno() {
		numMatricula=0;
		nombre="";
		direccion="";
		asignatura=new Asignatura();
		nota=0.0;
		centro=new Centro();
	}
	public Alumno(int nm,String n, String d, Asignatura a, double not, Centro c) {
		numMatricula=nm;
		nombre=n;
		direccion=d;
		asignatura=a;
		nota=not;
		centro=c;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int nm) {
		numMatricula=nm;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		nombre=n;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String d) {
		direccion=d;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura a) {
		asignatura=a;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double not) {
		nota=not;
	}
	public Centro getCentro() {
		return centro;
	}
	public void setCentro(Centro c) {
		centro=c;
	}
}
