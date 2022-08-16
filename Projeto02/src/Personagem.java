public class Personagem{
    String nome;
    int nivel, forca;

    //void significa que não esta retornando
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força", nome, nivel, forca);
    }
}