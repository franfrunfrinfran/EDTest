package escuelaIdiomas;

public class Centro {
	private int idCentro;
	private String nombre;
	private String direccion;
	
	public Centro() {
		idCentro=0;
		nombre="";
		direccion="";
		
	}
	public Centro(int id, String n, String d) {
		idCentro=id;
		nombre=n;
		direccion=d;
	}
	public int getIdCentro() {
		return idCentro;
	}
	public void setIdCentro(int id) {
		idCentro=id;
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

}
