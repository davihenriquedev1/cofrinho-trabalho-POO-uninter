package financeiro;

public class Euro extends Moeda {
	
    public Euro(double valor, String tipo) {
        super(valor, tipo);
    }

    @Override
    double converter() {
        // Conversão de euro para real (1 euro = 5,40 reais)
        return getValor() * 5.40;
    }

	@Override
	public String toString() {
		return "Euro [converter()=" + converter() + ", Valor()=" + getValor() + ", getClass()=" + getClass()
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

