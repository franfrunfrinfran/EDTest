package escuelaIdiomas;

public class Asignatura {
	private int idAsignatura;
	private String nombre;
	private int horas;
	
	public Asignatura() {
		idAsignatura=0;
		nombre="";
		horas=0;
	}
	public Asignatura(int id, String n, int h) {
		idAsignatura=id;
		nombre=n;
		horas=h;
	}
	public int getIdAsignatura() {
		return idAsignatura;
	}
	public void setIdAsignatura(int id) {
		idAsignatura=id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		nombre=n;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int h) {
		horas=h;
	}

}
