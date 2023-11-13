package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService{
	
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;

		//Listar todos
		public List<Departamento> listarDepartamentos(){
			return iDepartamentoDAO.findAll();
		};
		
		//Listar por id
		public Departamento departamentoXID(Integer id) {
			return iDepartamentoDAO.findById(id).get();
		}; 
		
		//Guardar
		public Departamento guardarDepartamento(Departamento departamento) {
			return iDepartamentoDAO.save(departamento);
		};
		
		//Actualizar
		public Departamento actualizarDepartamento(Departamento departamento) {
			return iDepartamentoDAO.save(departamento);
		};
		
		//Eliminar
		public void eliminarDepartamento(Integer id) {
			iDepartamentoDAO.deleteById(id);
		}	

}