abstract class Animal{
	float peso;
	float tamanho;
	
	Animal (float peso, float tamanho){
		this.peso = peso;
		this.tamanho = tamanho;
	}

	void setPeso (float peso){
		this.peso = peso;
	}

	float getPeso(){
		return peso;
	}

	void setTamanho(float tamanho){
		this.tamanho = tamanho;
	}
	
	boolean possuiMama(){
		return false;
	}

	boolean possuiPena(){
		return false;
	}

	boolean possuiEscama(){
		return false;
	}

	abstract String emitirSom();
}

