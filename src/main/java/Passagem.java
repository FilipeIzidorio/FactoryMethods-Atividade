import Interface.ICalculoFactory;

public class Passagem {
    public Calculadora gerarPassagem(double valor, ICalculoFactory calculoFactory){
        var calculadora = new Calculadora(valor,calculoFactory);
        System.out.println("Valor Da Passagem R$ : " + valor);
        System.out.println("Taxa De Embarque R$ : " +calculadora.calcularTaxaEmbarque());
        System.out.println("Taxa De Bagagem R$ : " + calculadora.calcularTaxaBagagem());
        System.out.println("Total R$ : "+ (valor+calculadora.calcularTaxaBagagem()+calculadora.calcularTaxaEmbarque()));

        return calculadora;
    }
}
