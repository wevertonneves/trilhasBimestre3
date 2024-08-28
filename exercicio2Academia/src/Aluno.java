
public class Aluno {

    private String nome;
    private int idade;
    private double peso;
    private double altura;


    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean eMenorDeIdade() {
        return idade < 18;
    }


    public double calcularIMC() {

        return peso / (altura * altura);
    }


    public String obterInformacoes() {
        return "Nome do cliente: " + nome +
                ", Idade: " + idade +
                ", Peso: " + peso +
                ", Altura: " + altura +
                ", IMC: " + String.format("%.2f", calcularIMC()) +
                ", Menor de idade: " + (eMenorDeIdade() ? "Sim" : "Não");
    }
}
