
public abstract class ExpAbstraite {

    abstract String toStringInfixe();
    
    @Override
    public String toString() {
        return "Je suis une expression et me voila en notation infixee : "+toStringInfixe();
    }
    
}
