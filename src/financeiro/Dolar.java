package financeiro;

public class Dolar extends Moeda {

    public Dolar(double valor, String tipo) {
        super(valor, tipo);
    }


    @Override
    double converter() {
        // Conversão de dólar para real (1 dólar = 5,60 reais)
        return getValor() * 5.60;
    }

	@Override
	public String toString() {
		return "Dolar [converter()=" + converter() + ", Valor()=" + getValor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
    
}
