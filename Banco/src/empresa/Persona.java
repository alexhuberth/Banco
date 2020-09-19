package empresa;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected char sexo;
	protected static int cont=0;

	public Persona() {
		// TODO Auto-generated constructor stub
		this.nombre = "Sin Datos";
		this.apellido = "Sin Datos";
		this.edad = 0;
		this.sexo = ' ';
	}

	public Persona(String nombre, String apellido, int edad, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	public String toString() {
		cont++;
		return "Persona "+cont+" \nnombre: " + nombre + "\napellido: " + apellido + "\nedad: " + edad + "\nsexo: " + sexo;
	}
	
	
	
	

}
