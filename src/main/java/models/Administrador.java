package models;

import controllers.CriarHosp;
import controllers.DeletarHosp;
import controllers.ProcurarHosp;
import controllers.AtualizarHosp;
import lombok.Data;

import java.util.Scanner;

@Data
public class Administrador {
    Cadastro cadastro;
    AtualizarHosp atualizarHosp;
    CriarHosp criarHosp;
    DeletarHosp deletarHosp;
    ProcurarHosp procurarHosp;

    public void escolherOpcao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1-Excluir Hospedagem");
        System.out.println("2-Editar Hospedagem");
        System.out.println("3-Procurar Hospedagem");
        System.out.println("4-Criar Hospedagem");
        System.out.println("5-Cadastrar novo operador");

        System.out.print("Escolha: ");
        Integer escolha = sc.nextInt();

        if (escolha == 1){
            getDeletarHosp();
        } else if (escolha == 2) {
            getAtualizarHosp();
        } else if (escolha == 3) {
            getProcurarHosp();
        } else if (escolha == 4) {
            getCriarHosp();
        }
        else
            getCadastro();

        sc.close();
    }
}
