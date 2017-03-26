package exercicio;

public class Lampada {

	private String status = "Desligada";

	public void getStatus() {
		System.out.println("A lampada esta: " + status);
		
	}

	public void turnOn() {
		this.status = "Ligada";
		
	}

	public void turnOff() {
		this.status = "Desligada";
		
	}
	

}
