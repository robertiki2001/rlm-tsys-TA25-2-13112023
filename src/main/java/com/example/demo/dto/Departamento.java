package com.example.demo.dto;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table (name = "departamentos")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int presupuesto;
	@OneToMany
    @JoinColumn(name="id")
	private List<Empleado> empleados;
	
	  public Departamento() {
	    }
	  
	    public Departamento(int id, String nombre, int presupuesto) {
	    	this.id = id;
	        this.nombre = nombre;	 
	        this.presupuesto = presupuesto;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public int getPresupuesto() {
			return presupuesto;
		}

		public void setPresupuesto(int presupuesto) {
			this.presupuesto = presupuesto;
		}
	   
}