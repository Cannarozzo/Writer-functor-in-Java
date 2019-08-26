package writerr;
import java.util.function.Function;

public class Writerr<A> {
	private A valor;
	private String log;
	
	public Writerr(A valor, String log) {
		this.valor = valor;
		this.log = log;
	}
	
	public A getA() {
		return this.valor;
	}
	
	public String getLog() {
		return this.log;
	}
	@Override
	public String toString() {
		return "Writerr [valor=" + valor + ", log=" + log + "]";
	}
	
	
}
