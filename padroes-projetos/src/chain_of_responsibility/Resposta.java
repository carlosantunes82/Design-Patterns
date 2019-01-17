package chain_of_responsibility;
interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}