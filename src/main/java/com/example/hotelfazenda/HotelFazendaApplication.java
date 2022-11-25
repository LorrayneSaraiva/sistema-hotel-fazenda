package com.example.hotelfazenda;

import models.Login;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class HotelFazendaApplication {

	public static void main(String[] args) {

		SpringApplication.run(HotelFazendaApplication.class, args);
		Scanner sc = new Scanner(System.in);

		Login login = new Login();
		System.out.println("Login");
		String nome = sc.nextLine();
		System.out.println("Senha");
		String senha = sc.nextLine();
		login.verificaLogin(nome, senha);


		sc.close();
	}

}
