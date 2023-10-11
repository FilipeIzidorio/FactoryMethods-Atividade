package Nacional;

import Interface.ICalculoFactory;
import Interface.ITaxaBagagem;
import Interface.ITaxaEmbarque;

public class NacionalFactory implements ICalculoFactory {
    @Override
    public ITaxaEmbarque criarTaxaEmbarque() {
        return new TaxaEmbarqueNacional();
    }


    @Override
    public ITaxaBagagem CriarTaxaBagagem() {
        return new TaxaBagagemNacional();
    }
}
