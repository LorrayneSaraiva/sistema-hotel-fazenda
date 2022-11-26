package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

@RestController
public class AtualizarHosp {

    private String campo;
    private String valor;
    public void camposAtualizar() throws SQLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Campo para atualizar: ");
        campo = sc.nextLine();
        System.out.println("valor");
        valor = sc.nextLine();
        queryParaAtualizar(campo, valor);

        sc.close();
    }
    @PutMapping
    public String queryParaAtualizar(@RequestParam String campo, @RequestParam String valor) throws SQLException {

        return updateDeleteDataFromQueryScript("UPDATE hotel.hospedar SET" + campo + " = " + valor);

    }
    public void updateDeleteDataFromQueryScript(String script) throws SQLException {

        Connection conn = DB.execute();
        Statement stmt = conn.createStatement();

        stmt.executeUpdate(script);

        stmt.close();
        conn.close();

    }
}
