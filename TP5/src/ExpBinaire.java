public abstract class ExpBinaire extends ExpAbstraite {

    ExpAbstraite opGauche;
    ExpAbstraite opDroit;
    
    public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        this.opGauche = opGauche;
        this.opDroit = opDroit;
    }
    

    
}

