package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Empleado;
import com.example.demo.services.EmpleadoService;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoService.listarEmpleados();
	}

	@GetMapping("/empleado/{dni}")
	public Empleado empleadoXID(@PathVariable(name = "dni") String dni) {
		return empleadoService.empleadoXID(dni);
	}

	@PostMapping("/empleado")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.guardarEmpleado(empleado);
	}

	@PutMapping("/empleado/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleado empleado) {

		Empleado empleado_seleccionado = empleadoService.empleadoXID(dni);
		Empleado empleado_actualizado = new Empleado();

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());

		empleado_actualizado = empleadoService.actualizarEmpleado(empleado_seleccionado);

		return empleado_actualizado;
	}

	@DeleteMapping("/empleado/{dni}")
	public void eliminarEmpleado(@PathVariable String dni) {
		empleadoService.eliminarEmpleado(dni);
	}

}
