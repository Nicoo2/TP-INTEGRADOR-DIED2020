package frsf.isi.died.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

import frsf.isi.died.util.unidadesmedidas.EstadoOrden;

public class OrdenDePedido {

	private Integer numOrden;
	private Planta plantaDestino;
	private LocalDateTime fechaSolicitud;
	private LocalDateTime fechaEntregaMaxima;
	private EstadoOrden estadoOrden;
	private ArrayList<DetalleItem> itemsSolicitados;
	private Camion camionAsignado;
	private Ruta rutaAsignada;
	private Double costoEnvio; 
	
	
	public OrdenDePedido(Planta p, LocalDateTime fm,ArrayList<DetalleItem> li) {
		this.estadoOrden  = EstadoOrden.CREADA;
		this.plantaDestino = p;
		this.itemsSolicitados = li;
	}
	
	
	
	
	
	
	
	public Integer getNumOrden() {
		return numOrden;
	}
	public void setNumOrden(Integer numOrden) {
		this.numOrden = numOrden;
	}
	public Planta getPlantaDestino() {
		return plantaDestino;
	}
	public void setPlantaDestino(Planta plantaDestino) {
		this.plantaDestino = plantaDestino;
	}
	public LocalDateTime getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public LocalDateTime getFechaEntrega() {
		return fechaEntregaMaxima;
	}
	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntregaMaxima = fechaEntrega;
	}
	public EstadoOrden getEstadoOrden() {
		return estadoOrden;
	}
	public void setEstadoOrden(EstadoOrden estadoOrden) {
		this.estadoOrden = estadoOrden;
	}
	
	public Camion getCamionAsignado() {
		return camionAsignado;
	}
	public void setCamionAsignado(Camion camionAsignado) {
		this.camionAsignado = camionAsignado;
	}
	public Ruta getRutaAsignada() {
		return rutaAsignada;
	}
	public void setRutaAsignada(Ruta rutaAsignada) {
		this.rutaAsignada = rutaAsignada;
	}
	public Double getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(Double costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	
	public ArrayList<DetalleItem> getItemsSolicitados() {
		return itemsSolicitados;
	}

	public void setItemsSolicitados(ArrayList<DetalleItem> itemsSolicitados) {
		this.itemsSolicitados = itemsSolicitados;
	}

	class DetalleItem {
		private Insumo insumoSolicitado;
		private Double cantidadInsumoSolicitado;
		private Double precioFinalItem;
		
		public DetalleItem(Insumo i, Double c) {
			this.insumoSolicitado = i;
			this.cantidadInsumoSolicitado = c;
			this.precioFinalItem = this.calculoPrecioFinalItem();
		}	
		
		
		public Double calculoPrecioFinalItem() {
			return insumoSolicitado.getCostoUnidadMedida() * cantidadInsumoSolicitado;
		}
		
		public Insumo getInsumoSolicitado() {
			return insumoSolicitado;
		}
		public void setInsumoSolicitado(Insumo insumoSolicitado) {
			this.insumoSolicitado = insumoSolicitado;
		}
		public Double getCantidadInsumoSolicitado() {
			return cantidadInsumoSolicitado;
		}
		public void setCantidadInsumoSolicitado(Double cantidadInsumoSolicitado) {
			this.cantidadInsumoSolicitado = cantidadInsumoSolicitado;
		}
		public Double getPrecioFinalItem() {
			return precioFinalItem;
		}
		public void setPrecioFinalItem(Double precioFinalItem) {
			this.precioFinalItem = precioFinalItem;
		}
		
		
	}
	
}


