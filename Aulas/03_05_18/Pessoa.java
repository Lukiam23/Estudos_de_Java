class Pessoa{
	int idade;

	Pessoa(int idade) throws IdadeMenorZeroException{
		if(idade < 0) throw new IdadeMenorZeroException();
		this.idade = idade;
	}

	void setIdade(int idade){
		this.idade = idade;
	}
}