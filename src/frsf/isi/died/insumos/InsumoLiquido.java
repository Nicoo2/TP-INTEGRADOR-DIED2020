package frsf.isi.died.insumos;

public class InsumoLiquido {

	private Double densidadLiquido;
	
	
	
	
	public Double pesoPorUnidad() {
		return densidadLiquido;
	}
	
	public Double pesoParaXCantidad(Double volumenEnLitros) {	
		return densidadLiquido * volumenEnLitros;
	}
}
