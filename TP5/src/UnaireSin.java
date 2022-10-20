public class UnaireSin extends ExpUnaire{

    public UnaireSin(ExpAbstraite operande) {
        super(operande);
        //TODO Auto-generated constructor stub
    }

    @Override
    String toStringInfixe() {
        // TODO Auto-generated method stub
        String s="sin(";
        s+=this.operande.toStringInfixe();
        s+=")";
        return s;
    }
    
}
