package entities;

public class Calculadora {
	
	private Integer resultadoInt;
	private Double resultadoreal;
	
	public Calculadora() {
	}
	
	public Integer soma(Integer a, Integer b) {
		this.resultadoInt = a + b;
		return resultadoInt;
	}
	
	public Double soma(Double a, Double b) {
		this.resultadoreal = a + b;
		return resultadoreal;
	}
	
	public Integer subtracao(Integer a, Integer b) {
		this.resultadoInt = a + b;
		return resultadoInt;
	}
	
	public Double subtracao(Double a, Double b) {
		this.resultadoreal = a + b;
		return resultadoreal;
	}
	
	public Integer multiplicacao(Integer a, Integer b) {
		this.resultadoInt = a + b;
		return resultadoInt;
	}
	
	public Double multiplicacao(Double a, Double b) {
		this.resultadoreal = a + b;
		return resultadoreal;
	}
	
	public Integer divisao(Integer a, Integer b) {
		this.resultadoInt = a + b;
		return resultadoInt;
	}
	
	public Double divisao(Double a, Double b) {
		this.resultadoreal = a + b;
		return resultadoreal;
	}

	public Integer getResultadoInt() {
		return resultadoInt;
	}

	public void setResultadoInt(Integer resultadoInt) {
		this.resultadoInt = resultadoInt;
	}

	public Double getResultadoreal() {
		return resultadoreal;
	}

	public void setResultadoreal(Double resultadoreal) {
		this.resultadoreal = resultadoreal;
	}

}
