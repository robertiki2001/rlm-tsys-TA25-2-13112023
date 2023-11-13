package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Departamento;


public interface IDepartamentoService {
	
		//Listar todos
		public List<Departamento> listarDepartamentos();
		
		//Listar por id
		public Departamento departamentoXID(Integer id); 
		
		//Guardar
		public Departamento guardarDepartamento(Departamento departamento);
		
		//Actualizar
		public Departamento actualizarDepartamento(Departamento departamento);
		
		//Eliminar
		public void eliminarDepartamento(Integer id);

}