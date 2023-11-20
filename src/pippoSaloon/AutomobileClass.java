package pippoSaloon;

public class AutomobileClass {
	private String marca;
	private String modello;
	private int cilindrata;
	private int voto;
	
	public AutomobileClass(String marca, String modello, int cilindrata, int voto) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.voto = voto;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModello() {
		return modello;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public int  getVoto() {
		return voto;
	}
	
	public String toString() {
		return marca + "\n"+ modello+"\nCilindrata: "+cilindrata+"\nVoto: "+voto+"/10";
	}
	
}
