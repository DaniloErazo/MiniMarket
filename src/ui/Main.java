package ui;

import java.time.LocalDate;
import java.util.Scanner;

import model.Minimarket;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	private Minimarket minimarket;

	public static void main(String[] args) {
		Main ppal = new Main();
		
		int option = 0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
	}
	
	public Main() {
		minimarket = new Minimarket();
	}
	
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Bienvenido, por favor seleccione una opci�n\n" +
				"(1) Registrar ingreso al minimarket  Mi Barrio Te Quiere \n" +
				"(2) Consultar la cantidad de intentos de registro \n" +
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Mi Barrio Te quiere Minimarket");
			break;
		case 1:
			register();
			break;
		case 2:
			break;
		default:
			System.out.println("Error, opci�n no v�lida");
		
		}
	}
	
	public void register() {
		String idType = "";
		long idNumber = 0;
		boolean accepted = false;
		LocalDate actualDate = LocalDate.now();
		int month = actualDate.getDayOfMonth();
		
		while (!accepted) {
			System.out.println("Digite su tipo de identificaci�n. 1 para TI, 2 para CC, 3 para Pasaporte y 4 para CE");
			int tmp;
			try {
				tmp = sc.nextInt();
				switch (tmp) {
				case 1:
					idType="TI";
					accepted=true;
					break;
				case 2:
					idType="CC";
					accepted=true;
					break;
				case 3:
					idType="PP";
					accepted=true;
					break;
				case 4:
					idType="CE";
					accepted=true;
				default:
					System.out.println("Por favor digite una opci�n v�lida");
					break;
				}
			} catch (Exception e) {
				System.out.println("Solo puede digitar n�meros, verifique");
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}

