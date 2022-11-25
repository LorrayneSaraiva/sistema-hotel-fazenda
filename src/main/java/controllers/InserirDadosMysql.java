/*package controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import config.DB;
import models.Hospedagens;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InserirDadosMysql {

        Connection conn = DB.execute();

        for (Hospedagens hospedagens : hospedagens) {
            Statement stmt = conn.createStatement();
            String insertQuery = "INSERT INTO hospedar (hospedagem) \n" +
                    "VALUES ( \"" + investment.getMunicipio() + "\", " +
                    "\"" + investment.getNomeProduto().replace("\"", "'") + "\" , " +
                    "\"" + investment.getMesEmissao() + "\" , " +
                    "\"" + investment.getAnoEmissao() + "\" , " +
                    "\"" + investment.getCdPrograma() + "\" , " +
                    "\"" + investment.getCdSubPrograma() + "\" , " +
                    "\"" + investment.getCdFonteRecurso() + "\" , " +
                    "\"" + investment.getCdTipoSeguro() + "\" , " +
                    "\"" + investment.getCdEstado() + "\" , " +
                    "" + investment.getVlCusteio() + " , " +
                    "\"" + investment.getCdProduto() + "\" , " +
                    "\"" + investment.getCdMunicipio() + "\" , " +
                    "\"" + investment.getAtividade() + "\" , " +
                    "\"" + investment.getCdModalidade() + "\" , " +
                    "" + investment.getAreaInvest() + " );";
            stmt.executeUpdate(insertQuery);
            stmt.close();
        }

    public InserirDadosMysql() throws SQLException {
    }

    public void setHospedagens(Hospedagens hospedagens) {
        this.hospedagens = hospedagens;
    }

    public Hospedagens getHospedagens() {
        return hospedagens;
    }
        conn.close();


 */

