package Internacional;

import Interface.ITaxaEmbarque;

public class TaxaEmbarqueInternacional implements ITaxaEmbarque {
    @Override
    public double getTaxaEmbarque() {
        return 0.1;
    }
}
