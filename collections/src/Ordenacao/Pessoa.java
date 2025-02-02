package Ordenacao ;

public class Pessoa implements Comparable<Pessoa> {
    
    private String nome;

    private int idade;

    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public String toString(){
        return "Nome: " + nome 
        + "Idade: " + idade + "Altura: "
        + altura;
    }

}

class ComparatorPorAltura implements Comparable<Pessoa> {

    public int compareTo(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    @Override
    public int compareTo(Pessoa o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
