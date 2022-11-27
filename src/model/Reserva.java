package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Reserva  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String cliente_hosp ;
    private String  hospedagem;
    private String   data_reserva;
    private String    data_final;
    private Integer quantidade_dias;
    
    public Reserva() {
    	
    }

	public Reserva(Integer id, String cliente_hosp, String hospedagem,String data_reserva, String data_final, Integer quantidade_dias ) {
		super();
		this.id = id;
		this.cliente_hosp = cliente_hosp;
		this.hospedagem = hospedagem;
		this.data_reserva = data_reserva;
		this.data_final = data_final;
		this.quantidade_dias = quantidade_dias;
	}

	@Override
	public String toString() {
		return "Reserva [cliente_hosp=" + cliente_hosp + ", hospedagem=" + hospedagem + ", data_reserva=" + data_reserva
				+ ", data_final=" + data_final + ", quantidade_dias=" + quantidade_dias + "]";
	}

	public String getCliente_hosp() {
		return cliente_hosp;
	}

	public void setCliente_hosp(String cliente_hosp) {
		this.cliente_hosp = cliente_hosp;
	}

	public String getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(String hospedagem) {
		this.hospedagem = hospedagem;
	}

	public String getData_reserva() {
		return data_reserva;
	}



	public String getData_final() {
		return data_final;
	}

	public void setData_final(String data_final) {
		this.data_final = data_final;
	}

	public Integer getQuantidade_dias() {
		return quantidade_dias;
	}

	public void setQuantidade_dias(Integer quantidade_dias) {
		this.quantidade_dias = quantidade_dias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente_hosp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(cliente_hosp, other.cliente_hosp);
	}

	public void setData_reserva(String string) {
		// TODO Auto-generated method stub
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	

	

	
    

}
