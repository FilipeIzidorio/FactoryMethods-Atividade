package Internacional;

import Interface.ITaxaBagagem;

public class TaxaBagagemInternacional implements ITaxaBagagem {
    @Override
    public double getTaxaBagagem() {
        return 0.05;
    }
}
