
import Interface.ICalculoFactory;
import Interface.ITaxaEmbarque;
import Interface.ITaxaBagagem;
import lombok.Data;
@Data


public class Calculadora {
    private double valor;
    private ITaxaEmbarque taxaEmbarque ;
    private ITaxaBagagem taxaBagagem;


    public Calculadora(double valor, ICalculoFactory calculoFactory) {
        this.valor = valor;
        this.taxaBagagem = calculoFactory.CriarTaxaBagagem();
        this.taxaEmbarque = calculoFactory.criarTaxaEmbarque();

    }
    public double calcularTaxaBagagem(){
        return this.valor * this.taxaBagagem.getTaxaBagagem();
    }
    public  double calcularTaxaEmbarque(){
        return this.valor * this.taxaEmbarque.getTaxaEmbarque();
    }

}
