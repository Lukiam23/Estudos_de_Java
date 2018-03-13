class Pessoa {
   String nome;
   int idade;

   Pessoa () {
   }
   Pessoa(String nome){
       //this.nome = nome;
	this(nome,0);
   }
   Pessoa (String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
   }

   void setNome (String nome) {
      this.nome = nome;
   }
   
    void setIdade (int idade) {
      this.idade = idade;
   }
   
   String getNome () {
      return this.nome;
   }

   int getIdade () {
      return this.idade;
   }
}
