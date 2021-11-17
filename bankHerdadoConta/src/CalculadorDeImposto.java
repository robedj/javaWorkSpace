import org.jetbrains.annotations.NotNull;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(@NotNull Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
