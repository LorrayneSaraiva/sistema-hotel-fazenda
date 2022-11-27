package model.dao;

import java.util.List;

import model.Hospedagem;

public interface HospedagemDao {
	
	void insert(Hospedagem obj);
	void update(Hospedagem obj);
	void deleteById(Hospedagem obj);
	Hospedagem findById(Integer id);
	
	List<Hospedagem> findAll();

}
