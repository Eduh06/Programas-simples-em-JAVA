 class rodar {  				//classe

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		
		carro1.setCor("Laranja");
		carro1.setModelo("Fusca");
		carro1.setcapTanque(50);
		
		 
	System.out.print("O modelo do carro �  " + carro1.getModelo());
	System.out.print(" sua cor � " + carro1.getCor());
	System.out.print(" a capacidade do tanque � " + carro1.getcapTanque() + " litros ");
	System.out.print(" e para completar o tanque com a gasolina o valor � " + carro1.totalValorTanque(7) + " reais." );
			
	}
		
}
				