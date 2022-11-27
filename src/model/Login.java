package model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.OperadorDao;

public class Login {
	
	
	
	    private String nome;
	    private String senha;
	    
	    public Login() {
			
		}
	    
	    public Login(String nome, String senha) {
			super();
			this.nome = nome;
			this.senha = senha;
		}
	    
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
	            	
	           
	            }
	            
	            
	            	
	            
	            sc.close();
	    	}
	    
	    
	    
	    public void verificaLogin(String nome, String senha){
	        if (nome.equals("admin") || senha.equals ("admin")){
	            System.out.println("Logado como adm");
	            crudAdmin();
	        }
	        
	        OperadorDao operadorDao = DaoFactory.createOperadorDao();
            Operador operador = new Operador();
            
           	operador.setNome(nome);
           	operador.setSenha(senha);
            operadorDao.logar(operador);
          if(operadorDao == null) {
        	  System.out.println("Senha ou nome inválidos");
          }
       
	        
	       
	    }
	    
	    
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		@Override
		public String toString() {
			return "Login [nome=" + nome + ", senha=" + senha + "]";
		}

		

}
