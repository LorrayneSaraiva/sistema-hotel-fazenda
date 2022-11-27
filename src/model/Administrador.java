package model;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.OperadorDao;
import model.dao.ReservaDao;
public class Administrador {
	
	     

	       public void crudAdmin() {
    			Integer id;
		    	String nome;
	            String email;
	            String senha;
	            String cpf;
	            String rg;
	            Double salario;
	            
	       
    	 	System.out.println("Escolha uma opção");
            System.out.println("1 - Criar Operador");
            System.out.println("2 - Listar Operadores");
            System.out.println("3 - Modificar Operadores");
            System.out.println("4 - Deletar Operadores");
            System.out.println("5 - Busca por ID");
            System.out.println("6 - Menu Reservas");
           
            
            Scanner sc = new Scanner(System.in);
            String opcao = sc.nextLine();
            
            OperadorDao operadorDao = DaoFactory.createOperadorDao();
            Operador operador = new Operador();
            
            switch (opcao) {
            
            case "1":
            	System.out.println("nome");
            	 nome = sc.nextLine();
            	 System.out.println("email");
            	 email = sc.nextLine();
            	 System.out.println("senha");
            	 senha = sc.nextLine();
            	 System.out.println("cpf");
            	 cpf = sc.nextLine();
            	 System.out.println("rg");
            	 rg = sc.nextLine();
            	 System.out.println("salario");
            	 salario = sc.nextDouble();
            	 
            	Operador newOperador = new Operador(null,nome,email,senha,cpf,rg,salario);
        		operadorDao.insert(newOperador);
        		
        		System.out.println("Inserted! New id = " + newOperador.getId());
        		
        		break;
        		
            case "2":
            	
            	List<Operador> list = operadorDao.findAll();
        		for (Operador obj : list) {
        			System.out.println(obj);
        		}
        		break;
        		
            case "3":
            	
            	System.out.println("Buscar por id");
            	id = sc.nextInt();
            	
            	operador = operadorDao.findById(id);
            	
            		while(operador == null) {
            			System.out.println("Id não existe");
            			System.out.println("digite outro ID");
    	            	id = sc.nextInt();
            			operador = operadorDao.findById(id);
            			
            		}
            	
            	System.out.println(operador);
            	
            	System.out.println("campo que deseja modificar");
            	sc.nextLine();
            	String campo = sc.nextLine();
            	
            	if(campo.equals("nome")) {
            		
            		nome = sc.nextLine();
            		operador.setNome(nome);
	        		operadorDao.update(operador);
	        		
            	} else if (campo.equals("email")) {
            		
            		email = sc.nextLine();
            		operador.setEmail(email);
	        		operadorDao.update(operador);
	        		
            	} else if (campo.equals("senha")) {
            		
            		senha = sc.nextLine();
            		operador.setSenha(senha);
	        		operadorDao.update(operador);
	        		
            	} else if (campo.equals("cpf")) {
            		
            		cpf = sc.nextLine();
            		operador.setCpf(cpf);
	        		operadorDao.update(operador);
	        		
            	} else if (campo.equals("rg")){
            		
            		rg = sc.nextLine();
            		operador.setRg(rg);
	        		operadorDao.update(operador);
	        		
            	} else if (campo.equals("salario")) {
            		
            		salario = sc.nextDouble();
            		operador.setSalario(salario);
	        		operadorDao.update(operador);
	        		
            	}
            	
        		
        		System.out.println("Update Completed!");
            	
        		break;
        		
            case "4":

        		System.out.println("Digite o Id que desejar deletar");
        		id = sc.nextInt();
            	operadorDao.deleteById(id);
        		
            	System.out.println("Delet Completed!");
            	break;
            	
            case "5": 
            	System.out.println("Buscar por id");
            	id = sc.nextInt();
            	
            	operador = operadorDao.findById(id);
            	
            		while(operador == null) {
            			System.out.println("Id não existe");
            			System.out.println("digite outro ID");
    	            	id = sc.nextInt();
            			operador = operadorDao.findById(id);
            		}
            	
            	System.out.println(operador);
            	break;
            	
            case "6":
            	
            	crudreserva();
           
            }
            
            
            	
            
            sc.close();
    	}
    
	       public void crudreserva() {
	    	   	 Integer id;
	    		 String  cliente_hosp ;
	    	     String  hospedagem;
	    	     String  data_reserva;
	    	     String  data_final;
	    	     Integer quantidade_dias;
	    	     
	    	     System.out.println("Escolha uma opção");
	             System.out.println("1 - Criar Uma reserva");
	             System.out.println("2 - Listar Reservar");
	             System.out.println("3 - Modificar Reservas");
	             System.out.println("4 - Deletar Reservas");
	             System.out.println("5 - Busca por ID");
	             System.out.println("6 - Relátorio");
	            
	             Scanner sc = new Scanner(System.in);
	             String opcao = sc.nextLine();
	             
	            
	             Operador operador = new Operador();
	             ReservaDao reservaDao = DaoFactory.createReservaDao();
	               
	             
	             switch (opcao) {
	             
	             case "1":
	             	System.out.println("Nome cliente");
	             	 cliente_hosp = sc.nextLine();
	             	 System.out.println("Qual quarto");
	             	 hospedagem = sc.nextLine();
	             	 System.out.println("Data de hoje");
	             	 data_reserva = sc.nextLine();
	             	 System.out.println("Data final");
	             	 data_final = sc.nextLine();
	             	 System.out.println("quantidade de dias");
	             	 quantidade_dias = sc.nextInt();
	             	 
	             	
	             	 
	             	Reserva reserva = new Reserva(null,cliente_hosp , hospedagem, data_reserva , data_final, quantidade_dias );
	               	
	        		reservaDao.insert(reserva);
	        		
	        		System.out.println("Inserted!");
	         		
	         		break;
	         		
	             case "2":
	             	
	             	List<Reserva> lista = reservaDao.findAll();
	         		for (Reserva obj : lista) {
	         			System.out.println(obj);
	         		}
	         		break;
	         		
	             case "3":
	             	
	             	System.out.println("Buscar por nome");
	             	cliente_hosp = sc.nextLine();
	             	
	             	reserva = reservaDao.findByName(cliente_hosp);
	             	
	             		while(reserva == null) {
	             			System.out.println("Nome não existe");
	             			System.out.println("digite outro Nome");
	             			cliente_hosp = sc.nextLine();
	             			reserva = reservaDao.findByName(cliente_hosp);
	             			
	             		}
	             	
	             	System.out.println(reserva);
	             	
	             	System.out.println("campo que deseja modificar");
	             	sc.nextLine();
	             	String campo = sc.nextLine();
	             	
	             	if(campo.equals("nome")) {
	             		
	             		cliente_hosp = sc.nextLine();
	             		reserva.setCliente_hosp(cliente_hosp);
	 	        		reservaDao.update(reserva);
	 	        		
	             	} else if (campo.equals("nome do quarto")) {
	             		
	             		hospedagem = sc.nextLine();
	             		reserva.setHospedagem(hospedagem);
	 	        		reservaDao.update(reserva);
	 	        		
	             	} else if (campo.equals("data final")) {
	             		
	             		data_final = sc.nextLine();
	             		reserva.setData_final(data_final);
	 	        		reservaDao.update(reserva);
	 	        		
	             	} else if (campo.equals("quantos dias")) {
	             		
	             		quantidade_dias = sc.nextInt();
	             		reserva.setQuantidade_dias(quantidade_dias);
	 	        		reservaDao.update(reserva);
	 	        		
	             	} 
	             	
	             	
	         		
	         		System.out.println("Update Completed!");
	             	
	         		break;
	         		
	             case "4":

	         		System.out.println("Digite o nome que desejar deletar");
	         		cliente_hosp = sc.nextLine();
	             	reservaDao.deleteByName(cliente_hosp);
	         		
	             	
	             	System.out.println("Delet Completed!");
	             	break;
	             	
	             case "5": 
	             	System.out.println("Buscar por id");
	             	cliente_hosp = sc.nextLine();
	             	
	             	reserva = reservaDao.findByName(cliente_hosp);
	             	
	             		while(reserva == null) {
	             			System.out.println("nome não existe");
	             			System.out.println("digite outro nome");
	     	            	id = sc.nextInt();
	     	            	reserva = reservaDao.findByName(cliente_hosp);
	             		}
	             	
	             	System.out.println(reserva);
	             	break;
	             	
	             case "6":
	             	
	            break;
	             }
	             
	       }
	       }
	    
	

