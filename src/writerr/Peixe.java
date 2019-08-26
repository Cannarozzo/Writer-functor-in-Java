package writerr;

import java.util.function.Function;


public class Peixe<A, B, C> {
	
	/*
	public Function<A, Writerr<C>> teste(Function< A, Writerr<B> > f, Function<B, Writerr<C>> g, A valor) {
		Writerr<B> w1 = f.apply(valor);
		Writerr<C> w2 = g.apply(w1.getA());
		
		Function<A, Writerr<C>> retorno = a -> new Writerr<C>(w2.getA(), w1.getLog() + w2.getLog()) ;
		return retorno;
	}
	*/
	
	public  Writerr<C> peixe (Function< A, Writerr<B> > f, Function<B, Writerr<C>> g, A valor) {
		Writerr<B> w1 = f.apply(valor);
		Writerr<C> w2 = g.apply(w1.getA());		
		 
		return new Writerr<C>(w2.getA(), w1.getLog() + w2.getLog()) ;
	}
	
	public Writerr<A> retorno (A valor ){		
		return new Writerr<A>(valor,"");
	}
}
