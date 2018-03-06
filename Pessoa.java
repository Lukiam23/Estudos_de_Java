class Pessoa {
   String nome;
   int idade;

   Pessoa () {
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

class Alo {
  public static void main (String args[]) {
    System.out.println("Alo Mundo!");

    Pessoa ana;
    ana = new Pessoa();
    ana.setNome("Ana");
    ana.setIdade(25);
    System.out.println(ana.getNome());
    System.out.println(ana.getIdade());

  }
}
