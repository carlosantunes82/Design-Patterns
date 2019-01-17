package chain_of_responsibility;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
