public class BinaireMult extends ExpBinaire {

    public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroit) {
        super(opGauche, opDroit);
        //TODO Auto-generated constructor stub
    }

    @Override
    String toStringInfixe() {
        // TODO Auto-generated method stub
        String s= "(";
        s += this.opGauche.toStringInfixe();
        s += " * ";
        s += this.opDroit.toStringInfixe();
        s+=")";
        return s;

    }
    


    
    
}
