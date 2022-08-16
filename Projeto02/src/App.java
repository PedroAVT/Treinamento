public class App {
    public static void main(String[] args) throws Exception {
        Personagem personagem = new Personagem();
        personagem.nome = "Thor";
        personagem.nivel = 2;
        personagem.forca = 16;

        personagem.mostrarStatus();

    }
}
