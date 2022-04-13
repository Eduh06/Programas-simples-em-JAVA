
public class Carro {

	
	int capTanque;				//atributos
	String cor;
	String modelo;

	
	Carro() {	
	}
	
	Carro(String cor, String modelo, int capTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capTanque = capTanque;	
	}
	
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String getCor() {
		return cor;
	}
	
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	String getModelo() {
		return modelo;
	}
	
	
	void setcapTanque(int capTanque) {
		this.capTanque = capTanque;
	}
		
	int getcapTanque() {
		return capTanque;
	}

	double totalValorTanque(double valorCombustivel) {
		return capTanque * valorCombustivel;
		
	}

}


