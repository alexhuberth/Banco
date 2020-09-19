package empresa;

public class Cliente extends Persona{
	protected String dni;

	public Cliente() {
		dni ="";
		
	}
	public Cliente(String nombre,String apellido,int edad,char sexo,String dni) {
		super(nombre,apellido,edad,sexo);
		this.dni=dni;
	}
	public String toString() {
		return super.toString()+"\nDNI: "+dni;
	}
	

}
