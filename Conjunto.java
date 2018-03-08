puclic class Conjunto{
	int tamanho;
	int[] elementos;
	int index = 0;

	puclic Conjunto(int tamanho){
		elementos = new int[this.tamanho];
	}

	void inserirElemento(int elemento){
		if(verificarPertinencia(elemento) == false){
			elementos[this.index] = elemento;
			this.index++;
		}
		
	}

	boolean verificarPertinencia(int elemento){
		for(int i = 0;i<this.tamanho;i++){
			if(elemento == elementos[i]){
				return true;
			}
		}
		return false;
	}

	boolean subconjunto(Conjunto A){
		boolean pertence;
		for(int i = 0;i<A.getTamanho();i++){
			pertence = false;
			for(int j = 0;j<this.tamanho; j++){
				if(A.getElemento(i) == this.elementos[j]){
					pertence = true;
				}
			}
			if(pertence == false){
				return false
			}
		}
		return true;
	}

	Conjunto conjuntoUnião(Conjunto A){
		Conjunto uniao;
		int tamanho = A.getTamanho() + this.tamanho;
		uniao = new Conjunto(tamanho);
		for(int i = 0;i<A.getTamanho();i++){
			uniao.inserirElemento(A.getElemento(i));
		}
		for(int j = 0;i<this.tamanho;j++){
			uniao.inserirElemento(this.elementos[i]);
		}
		return uniao;

	}

	Conjunto conjuntoIntersecao(Conjunto A){
		Conjunto intersecao;
		int tamanho = A.getTamanho() + this.tamanho;
		intersecao = new Conjunto(tamanho);
		for(int i = 0;i<A.getTamanho();i++){
			for(int j = 0;j<this.tamanho;j++){
				if(A.getElemento(i) == this.elementos[j]){
					intersecao.inserirElemento(this.elementos[j]);
				}
			}
		}
		return intersecao;
	}

	Conjunto conjuntoDiferenca(Conjunto A){
		Conjunto intersecao = conjuntoIntersecao(A);
		Conjunto diferenca;
		boolean pertence;
		for(int i = 0;i<intersecao.getTamanho();i++){
			for(int j = 0;j<this.tamanho;j++){
				if(intersecao.getElemento(i) == this.elementos[j]){
					
				}
			}
		}
	}

	int getTamanho(){
		return this.tamanho;
	}
	int getElemento(int index){
		return this.elementos[index];
	}
}