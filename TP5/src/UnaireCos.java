public class UnaireCos extends ExpUnaire{

    public UnaireCos(ExpAbstraite operande) {
        super(operande);
        //TODO Auto-generated constructor stub
    }

    @Override
    String toStringInfixe() {
        String s="cos(";
        s+=this.operande.toStringInfixe();
        s+=")";

        return s ;
    }
    
}
