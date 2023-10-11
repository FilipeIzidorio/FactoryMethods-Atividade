package Nacional;

import Interface.ITaxaEmbarque;

public class TaxaEmbarqueNacional implements ITaxaEmbarque {
    @Override
    public double getTaxaEmbarque() {
        return 0.05;
    }
}
