package Internacional;
import Interface.ICalculoFactory;
import Interface.ITaxaBagagem;
import Interface.ITaxaEmbarque;

public class InternacionalFactory implements ICalculoFactory {
    @Override
    public ITaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueInternacional();
    }

    @Override
    public ITaxaBagagem CriarTaxaBagagem() {
        return new TaxaBagagemInternacional();
    }
}
