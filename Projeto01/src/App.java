public class App {
    public static void main(String[] args) throws Exception {
       //Iphone 12, tela 6.1", 256gb
       //Galaxy Note 20 Ultra, tela 6.9", 256gb
       //Xiaomi Mi 11 Pro, tela 6.81", 128gb
       //<tipoVariavel> nomeVariavel = valor;

       //Declarando um objeto do tipo Celular = Instanciando um objeto
       Celular celularA = new Celular();
       celularA.nome = "Iphone 12";
       celularA.tamanhaTela = 6.1f;
       celularA.espaçoArmazenamento = 256;
       celularA.sistemaOperacional = "IOS";

       System.out.format("Celular %s com tela de %.1f, tamanho de %dgb e SO %s\n", celularA.nome, celularA.tamanhaTela, celularA.espaçoArmazenamento, celularA.sistemaOperacional);      

       Celular celularB = new Celular();
       celularB.nome = "Galaxy Note 20 Ultra";
       celularB.tamanhaTela = 6.9f;
       celularB.espaçoArmazenamento = 256;
       celularB.sistemaOperacional = "Android";

       System.out.format("Celular %s com tela de %.1f, tamanho de %dgb e SO %s\n", celularB.nome, celularB.tamanhaTela, celularB.espaçoArmazenamento, celularB.sistemaOperacional);

       Celular celularC = new Celular();
       celularC.nome = "Xiaomi Mi 11 Pro";
       celularC.tamanhaTela = 6.81f;
       celularC.espaçoArmazenamento = 128;
       celularC.sistemaOperacional = "Xiaomi";

       System.out.format("Celular %s com tela de %.2f, tamanho de %dgb e SO %s", celularC.nome, celularC.tamanhaTela, celularC.espaçoArmazenamento, celularC.sistemaOperacional);
   }
}
