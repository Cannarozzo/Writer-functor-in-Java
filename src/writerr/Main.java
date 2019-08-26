package writerr;
import java.util.function.Function;
@SuppressWarnings("unchecked")

public class Main {
	public static <T, R> void main(String[] args) {
		Peixe p = new Peixe<Integer, Integer, Integer>();
		
		Function<Integer, Writerr> f = a -> new Writerr(a, "log");
		Function<Writerr, Integer> g =  b -> (Integer)b.getA();			
		Function<Integer, Integer> h = x -> g.compose(f).apply(x);
		
		System.out.println(h.apply(4));
		
		
		Function<Boolean, Writerr<Boolean>> notW = x -> x == true ? p.retorno(x) : new Writerr<Boolean>(x,"not");
		Function<Integer, Writerr<Boolean>> is_even = x -> new Writerr<Boolean>( x % 2 == 0 ? true : false, "even");
		Function<Integer, Writerr<Boolean>> is_odd = x -> p.peixe(is_even,notW,x); 
		
		System.out.println(is_odd.apply(4));
		
	}
}
