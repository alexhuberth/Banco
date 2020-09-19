package empresa;

public class Principal {

	public static void main(String[] args) {
		Persona objPersona1=new Persona("ALEX","ALARCON",30,'H');
		Persona objPersona2=new Cliente("HUBERTH","BELGA",25,'H',"42681393");
		Persona objPersona3=new Cliente("JUAN","OPPORT",13,'H',"426813934");
		Persona objPersona4=new Cliente("JULIO","BERNAL",67,'H',"426813954");
		Persona objPersona5=new Cliente("CARLOS","LESTES",45,'H',"426813123");
		Persona objPersona6=new Cliente("ISAIAS","CORONA",20,'H',"42681567");
		
		
		System.out.println(objPersona1);
		System.out.println(objPersona2);
		System.out.println(objPersona3);
		System.out.println(objPersona4);
		System.out.println(objPersona5);
		System.out.println(objPersona6);

	}

}
