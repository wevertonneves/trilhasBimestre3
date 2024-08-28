public class Main {
    public static void main(String[] args) {

        Universidade universidadePrinceton = new Universidade("Princeton");
        Universidade universidadeCambridge = new Universidade("Cambridge");


        Pessoa albertEinstein = new Pessoa("Albert Einstein", "14/3/1879", universidadePrinceton);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", "4/1/1643", universidadeCambridge);


        System.out.println(albertEinstein.getInformacoes());
        System.out.println(isaacNewton.getInformacoes());
    }
}
