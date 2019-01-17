package chain_of_responsibility;
public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

		double valor = imposto.calcula(orcamento);

		System.out.println(valor);

	}

}