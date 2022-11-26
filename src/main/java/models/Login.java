package models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Login implements Serializable {
    private String nome;
    private String senha;

    Administrador administrador;
    Operador operador;
    public void verificaLogin(String nome, String senha){

        if (nome == "admin" && senha =="admin"){
            System.out.println("Logado como adm");
            administrador.escolherOpcao();
        }
        else {
            operador.escolherOpcao();
        }

        //criar duas variaveis
        //Uma para buscar o nome
        //outra para buscar a senha no banco de dados de operador
    }
}
