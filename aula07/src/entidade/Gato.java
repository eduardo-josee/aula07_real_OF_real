package entidade;

public class Gato extends Animal {
	
	 @Override
	    public String emitirSom() {
	        return super.emitirSom()+"gato é: Miau Miau";
	    }
}
