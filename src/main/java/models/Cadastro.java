package models;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Cadastro implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String email;
    private String cpf;
    private String rg;
    private Double salario;

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cadastro other = (Cadastro) obj;
        return Objects.equals(id, other.id);
    }
    @Override
    public String toString() {
        return "Operador [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", rg=" + rg
                + ", salario=" + salario + "]";
    }


}
