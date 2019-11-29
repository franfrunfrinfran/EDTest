package escuelaIdiomas;

public class TestCentro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Centro ingles=new Centro (1234,"Escuela de Inglés","Reyes Católicos, 14");		
		Centro frances=new Centro (76,"Escuela de Francés","	Cristóbal Colón, 92");
		
		Asignatura B1=new Asignatura(756,"Inglés B1",400);
		Asignatura B2= new Asignatura(56,"Ingles B2",400);
		Asignatura fB1=new Asignatura (234,"Francés B1",400);
		Asignatura fA2=new Asignatura (312,"Francés A2",400);
		
		
		Alumno Ana=new Alumno (87,"Ana Abel","Paseo de América, 15",B1,7,ingles);
		Alumno Benito=new Alumno (34,"Benito Bueno","Reyes Católicos, 16",B2,6,ingles);
		Alumno Carmen=new Alumno (65,"Carmen Cano","Reyes Católicos, 2",B1,5,ingles);
		Alumno Esteban=new Alumno (98,"Esteban Escalera","Isabel la Católica, 28",fB1,9,frances);
		Alumno Francisco=new Alumno (32,"Francisco Farfan","Cristóbal Colón, s/n",fA2,8.5,frances);
		
		
		String ing=ingles.getDireccion();
		String fra=frances.getDireccion();
				
		String alumn=Carmen.getCentro().getDireccion();
		double alumn2=Benito.getNota();
		
		System.out.println("La escuela de Inglés está en: "+(ing));
		System.out.println("La escuela de Francés está en: "+(fra));
		System.out.println("La dirección del centro donde estudia Carmen es: "+(alumn));
		System.out.println("La nota de Benito en inglés es: "+(alumn2));

		
		
		
		
		
		
	}

}
