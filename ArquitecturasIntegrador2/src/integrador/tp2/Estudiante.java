package integrador.tp2;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estudiante {
	@Id
	private float dni;
	@Column(nullable = false)
	private String nombres;
	@Column(nullable = false)
	private String apellido;
	@Column
	private int edad;
	@Column(nullable = false)
	private String genero;
	@Column(nullable = false)
	private String recidencia;
	@Column
	private int libretaUniversitaria;
	@OneToMany
	private HashMap<Integer, Carrera> carreras;
	
	public Estudiante() {
		super();
	}

	public Estudiante(float dni, String nombres, String apellido, int edad, String genero, String recidencia,
			int libretaUniversitaria, HashMap<Integer, Carrera> carreras) {
		super();
		this.dni = dni;
		this.nombres = nombres;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.recidencia = recidencia;
		this.libretaUniversitaria = libretaUniversitaria;
		this.carreras = carreras;
	}

	@Override
	public String toString() {
		return "Estudiante [dni=" + dni + ", nombres=" + nombres + ", apellido=" + apellido + ", edad=" + edad
				+ ", genero=" + genero + ", recidencia=" + recidencia + ", libretaUniversitaria=" + libretaUniversitaria
				+ ", carreras=" + carreras + "]";
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRecidencia() {
		return recidencia;
	}

	public void setRecidencia(String recidencia) {
		this.recidencia = recidencia;
	}

	public HashMap<Integer, Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(HashMap<Integer, Carrera> carreras) {
		this.carreras = carreras;
	}

	public float getDni() {
		return dni;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}
	
	
	
}
