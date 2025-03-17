package entidade;

public class Principal {

	public static void main(String[] args) {

		Carro civic = new Carro();

		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EUB-6530";
		civic.ano = 2022;
		civic.cor = "Preta";
		civic.acelera();
		civic.exibirInfo();

		Carro kicks = new Carro();

		kicks.fabricante = "Nissan";
		kicks.modelo = "Kicks SV";
		kicks.placa = "KLF-6530";
		kicks.ano = 2023;
		kicks.cor = "Branca";
		kicks.acelera();
		kicks.exibirInfo();

		Carro yaris = new Carro();

		yaris.fabricante = "Toyota";
		yaris.modelo = "Yaris Hatch";
		yaris.placa = "MKP-6530";
		yaris.ano = 2023;
		yaris.cor = "Cinza";
		yaris.acelera();
		yaris.exibirInfo();

		Carro Logan = new Carro();

		Logan.fabricante = "Renault";
		Logan.modelo = "Logan Expression 1.0 Flex Manual";
		Logan.placa = "SC-0712";
		Logan.ano = 2012;
		Logan.cor = "Prata";
		Logan.acelera();
		System.out.println(Logan);
		Logan.exibirInfo();

	}

}