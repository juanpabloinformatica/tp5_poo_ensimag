public class BinairePlus extends ExpBinaire {

    public BinairePlus(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
        //TODO Auto-generated constructor stub
    }

    @Override
    String toStringInfixe() {
        String s="(";
        s+=this.opGauche.toStringInfixe();
        s+=" + ";
        s+=this.opDroit.toStringInfixe();
        s+=")";
        return s;
    }

    
}
