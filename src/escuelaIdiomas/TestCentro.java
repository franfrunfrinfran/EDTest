package escuelaIdiomas;

public class TestCentro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Centro ingles=new Centro (1234,"Escuela de Ingl�s","Reyes Cat�licos, 14");		
		Centro frances=new Centro (76,"Escuela de Franc�s","	Crist�bal Col�n, 92");
		
		Asignatura B1=new Asignatura(756,"Ingl�s B1",400);
		Asignatura B2= new Asignatura(56,"Ingles B2",400);
		Asignatura fB1=new Asignatura (234,"Franc�s B1",400);
		Asignatura fA2=new Asignatura (312,"Franc�s A2",400);
		
		
		Alumno Ana=new Alumno (87,"Ana Abel","Paseo de Am�rica, 15",B1,7,ingles);
		Alumno Benito=new Alumno (34,"Benito Bueno","Reyes Cat�licos, 16",B2,6,ingles);
		Alumno Carmen=new Alumno (65,"Carmen Cano","Reyes Cat�licos, 2",B1,5,ingles);
		Alumno Esteban=new Alumno (98,"Esteban Escalera","Isabel la Cat�lica, 28",fB1,9,frances);
		Alumno Francisco=new Alumno (32,"Francisco Farfan","Crist�bal Col�n, s/n",fA2,8.5,frances);
		
		
		String ing=ingles.getDireccion();
		String fra=frances.getDireccion();
				
		String alumn=Carmen.getCentro().getDireccion();
		double alumn2=Benito.getNota();
		
		System.out.println("La escuela de Ingl�s est� en: "+(ing));
		System.out.println("La escuela de Franc�s est� en: "+(fra));
		System.out.println("La direcci�n del centro donde estudia Carmen es: "+(alumn));
		System.out.println("La nota de Benito en ingl�s es: "+(alumn2));

		
		
		
		
		
		
	}

}
