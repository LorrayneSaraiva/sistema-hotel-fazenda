package application;

import java.util.Date;
import java.util.Scanner;

import model.Login;
import model.Operador;
import model.Reserva;
import model.dao.DaoFactory;
import model.dao.OperadorDao;
import model.dao.ReservaDao;


public class Program {

	
	
	public static void main(String[]  args) {
		
		   ReservaDao reservaDao = DaoFactory.createReservaDao();
           Operador operador = new Operador();
           

		Scanner sc = new Scanner(System.in);

		Login login = new Login();
		System.out.println("Login");
		String nome = sc.nextLine();
		System.out.println("Senha");
		String senha = sc.nextLine();
		login.verificaLogin(nome, senha);

		
		
		
	//	System.out.println("nome do cliente");
   //	 String nome_cli = sc.nextLine();
   	 
   	// System.out.println("qual quarto");
   	// String hosp = sc.nextLine();
   	 
   	
   	 
  	// System.out.println("quantos dias");
   	 //Integer qnts_dias = sc.nextInt();
   	 
   //	Reserva reserva = new Reserva(null,"lorrayne" , "cabana" , "hoje" , "hoje ", 4 );
   	
		//reservaDao.insert(reserva);
		
		//System.out.println("Inserted!");
		
		//sc.close();
	}
	
	
}
