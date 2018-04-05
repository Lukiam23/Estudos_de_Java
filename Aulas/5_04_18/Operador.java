class Operador extends Expressao{
	Expressao esquerda, direita;

	int calcular(){
		return esquerda.calcular() + direita.calcular();
	}

	void adicionar(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
	}
}