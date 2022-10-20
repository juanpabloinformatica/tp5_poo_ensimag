class Constante extends ExpAbstraite{

    double valeur;
    public Constante(double valeur) {
        this.valeur = valeur;
    }
    public double getValeur() {
        return valeur;
    }
    
    @Override
    String toStringInfixe() {
        return ""+this.valeur;
    }
    
    
}