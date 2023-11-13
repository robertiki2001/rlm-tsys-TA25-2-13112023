package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoService implements IEmpleadoService{
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

		//Listar todos
		public List<Empleado> listarEmpleados(){
			return iEmpleadoDAO.findAll();
		};
		
		//Listar por id
		public Empleado empleadoXID(String dni) {
			return iEmpleadoDAO.findById(dni).get();
		}; 
		
		//Guardar
		public Empleado guardarEmpleado(Empleado empleado) {
			return iEmpleadoDAO.save(empleado);
		};
		
		//Actualizar
		public Empleado actualizarEmpleado(Empleado empleado) {
			return iEmpleadoDAO.save(empleado);
		};
		
		//Eliminar
		public void eliminarEmpleado(String dni) {
			iEmpleadoDAO.deleteById(dni);
		}		

}