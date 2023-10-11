package Nacional;

import Interface.ITaxaBagagem;

public class TaxaBagagemNacional implements ITaxaBagagem {
    @Override
    public double getTaxaBagagem() {
        return 0.03;
    }
}
