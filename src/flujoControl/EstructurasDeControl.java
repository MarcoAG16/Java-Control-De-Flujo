package flujoControl;

import java.util.Scanner;

public class EstructurasDeControl {//Debe coincidir la clase con el nombre de nuestro documento

	public static void main(String[] args) {//Todo dentro del metodo main
		
		//Recordad que para que algo se ejecute, siempre debe ir dentro del metodo principal
		/*
		
		//Primero deneri una variable del tipo stringdonde almaceno un dato
		String citaProgramada = "28-09-2023"; //Dejamos en Null y despues lo cambiamos a una fecha "28-09-23"
		//La Variable declarada, se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazado con un nuevo dato.
		
		
		if (citaProgramada!=null) {
			System.out.println("Ya hay una cita programada una disculpita");//Porque la variable ya esta ocupada o llena
			
		}else {
			System.out.println("Puede registrar su cita");//Podemos registrar una o otra cita
		}
		
		
////////////////////////////////////////////////////
		
		
		//Seleccionando una opcion y almacenando la variable
		
		int opcion = 3;
		
		//Creamos un menu 
		System.out.println("Menu del Diente Feliz");
		System.out.println("1 . Desea programar una cita?");
		System.out.println("2. Verificar Cita Programada");
		System.out.println("3. Cancelar Cita");
		System.out.println("4. Salir del Menu");
		System.out.print("Seleccione un opcion del Menu(1-4): ");
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opcion programar cita.");//Agrega la logica para programar una cita
			break;
		case 2: System.out.println("Usted ha seleccionado la opcion verificar cita");
		break;
		case 3: System.out.println("Usted ha seleccionado la opcion de cancelar la cita");
		break;
		case 4: System.out.println("Saliendo del Menu");
		 break;
		 default:
			System.out.println("La opcion que usted selecciono no es valida, por favor seleccione una opcion de nuestro menu (1-4).");
		}//switch cierre
		
		*/
		/////Actividad
		
		
		Scanner input = new Scanner(System.in);  // Create a Scanner object para solicitar un input
	    System.out.println("Ingresa una edad: ");
	    
	    int edad = input.nextInt();//se lee el input del usuario y con el metodo nextInt()
		
		String mensaje=edad>=18?"si es mayor de edad, puede accesar":"No es mayor de edad, solo acceso con un adulto.";
		System.out.println(mensaje);
		if(edad<18) {
			System.out.println("Viene con acompaniante mayor de edad? \n");
			System.out.println("Ingrese un true para si y un false para no \n");
			boolean verdad = input.nextBoolean();
			String verificarMensaje=verdad?"se le da servicio":"No se le da servicio";//condicional ternario para saber si llego acompaniado y mostrar el mensaje adecuado
			System.out.println(verificarMensaje);//imprimir el mensaje en consola
		}else {
			System.out.println("Le proporcionamos servicio");
			
			
			
		}
		
		System.out.println("Fin del programa");
		input.close();
		

	}//metodo

}//clase
