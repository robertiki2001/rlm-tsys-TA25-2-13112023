package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Departamento;
import com.example.demo.services.DepartamentoService;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoService departamentoService;

	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos() {
		return departamentoService.listarDepartamentos();
	}

	@GetMapping("/departamento/{id}")
	public Departamento departamentoXID(@PathVariable(name = "id") Integer id) {
		return departamentoService.departamentoXID(id);
	}

	@PostMapping("/departamento")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.guardarDepartamento(departamento);
	}

	@PutMapping("/departamento/{id}")
	public Departamento actualizarDepartamento(@PathVariable(name = "id") Integer id, @RequestBody Departamento departamento) {

		Departamento departamento_seleccionado = departamentoService.departamentoXID(id);
		Departamento departamento_actualizado = new Departamento();

		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());

		departamento_actualizado = departamentoService.actualizarDepartamento(departamento_seleccionado);

		return departamento_actualizado;
	}

	@DeleteMapping("/departamento/{id}")
	public void eliminarDepartamento(@PathVariable Integer id) {
		departamentoService.eliminarDepartamento(id);
	}

}
