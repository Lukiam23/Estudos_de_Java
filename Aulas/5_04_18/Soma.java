class Soma extends Operador{
    int calcular(){
        return esquerda.calcular() + direita.calcular();
    }
}
