public class Variable extends ExpAbstraite {

    String nom;
    public Variable(String variable) {
        this.nom = variable;
    }
    
    public String getNom() {
        return nom;
    }

    @Override
    String toStringInfixe() {
        System.out.println(""+this.nom);
        return ""+this.nom;
    }
    
    

        
}
