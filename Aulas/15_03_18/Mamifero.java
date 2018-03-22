abstract class Mamifero extends Animal{
	Mamifero(){
		super(0,0);
	}

	Mamifero(float peso, float tamanho){
		super(peso,tamanho);
	}

	boolean possuiMama(){
		return true;
	}

}
