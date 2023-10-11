import Internacional.InternacionalFactory;
import Nacional.NacionalFactory;

public class App {
    public static void main(String[] args) {
        var passagem = new Passagem();
        System.out.println("------Passagem Nacional ------");
        passagem.gerarPassagem(100,new NacionalFactory());

        System.out.println("------Passagem Internacional ------");
        passagem.gerarPassagem(100,new InternacionalFactory());




    }
}
