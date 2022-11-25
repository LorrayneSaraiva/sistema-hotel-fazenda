package models;

import controllers.AtualizarHosp;
import controllers.CriarHosp;
import controllers.DeletarHosp;
import controllers.ProcurarHosp;
import lombok.Data;

import java.util.Scanner;

@Data
public class Operador {
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

        System.out.print("Escolha: ");
        Integer escolha = sc.nextInt();

        if (escolha == 1){
            getDeletarHosp();
        } else if (escolha == 2) {
            getAtualizarHosp();
        } else if (escolha == 3) {
            getProcurarHosp();
        }
        else
            getCriarHosp();


        sc.close();
    }
}
