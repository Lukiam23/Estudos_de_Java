abstract class Reptil extends Animal{
	Reptil(){
		super(0,0);
	}
	
	Reptil(float peso, float tamanho){
		super(peso,tamanho);
	}

	boolean possuiEscama(){
		return true;
	}
}
