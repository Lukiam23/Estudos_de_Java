abstract class Ave extends Animal{
	Ave(){
		super(0,0);
	}

	Ave(float peso, float tamanho){
		super(peso,tamanho);
	}

	boolean possuiPena(){
		return true;
	}
}
