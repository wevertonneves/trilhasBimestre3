public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("weverton thiago neves nogueira", 29, 69.0, 1.75);
        Aluno aluno2 = new Aluno("Josefina Maria ribas", 16, 55.0, 1.55);
        Aluno aluno3 = new Aluno("celia Santinho Vieira", 18, 59.5, 1.79);


        System.out.println(aluno1.obterInformacoes());
        System.out.println(aluno2.obterInformacoes());
        System.out.println(aluno3.obterInformacoes());

    }
}
