package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Empleado;


public interface IEmpleadoService {
	
		//Listar todos
		public List<Empleado> listarEmpleados();
		
		//Listar por id
		public Empleado empleadoXID(String dni); 
		
		//Guardar
		public Empleado guardarEmpleado(Empleado empleado);
		
		//Actualizar
		public Empleado actualizarEmpleado(Empleado empleado);
		
		//Eliminar
		public void eliminarEmpleado(String dni);

}