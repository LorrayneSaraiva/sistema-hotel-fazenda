package models;

import lombok.Data;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Data
//@Entity
public class Hospedagens {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "ID", unique = true, nullable = false)
    private Long id;

    //@Column(nullable = false)
    private String tipo_hospedagem;

    //@Column(nullable = false)
    private String descricao;

    //@Column(nullable = false)
    private Integer ocupacao_max;

    //@Column(nullable = false)
    private Float preco;
}
