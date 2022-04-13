 class rodar {  				//classe

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		
		carro1.setCor("Laranja");
		carro1.setModelo("Fusca");
		carro1.setcapTanque(50);
		
		 
	System.out.print("O modelo do carro é  " + carro1.getModelo());
	System.out.print(" sua cor é " + carro1.getCor());
	System.out.print(" a capacidade do tanque é " + carro1.getcapTanque() + " litros ");
	System.out.print(" e para completar o tanque com a gasolina o valor é " + carro1.totalValorTanque(7) + " reais." );
			
	}
		
}
				