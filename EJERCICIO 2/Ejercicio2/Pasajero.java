package Ejercicio2;

public class Pasajero {
	private String nombre;
	private String documento;
	private String fechaViaje;
	private String origen;
	private String destino;
	private String piso;
	private String calidadServicio;
	private String serviciosOpcionales;
	
	public Pasajero(String nombre, String documento, String fechaViaje, String origen, String destino, String piso, String calidadServicio, String serviciosOpcionales) {
		this.nombre=nombre;
		this.documento=documento;
		this.fechaViaje=fechaViaje;
		this.origen=origen;
		this.destino=destino;
		this.piso=piso;
		this.calidadServicio=calidadServicio;
		this.serviciosOpcionales=serviciosOpcionales;
	}
	
	public String obtenerResumen() {
		return "RESUMEN DEL PASAJE\n"+
				"Nombre: "+nombre+"\n"+
				"Documento: "+documento+"\n"+
				"Fecha de viaje: "+fechaViaje+"\n"+
				"Ruta: "+origen+"\n"+
				"Destino: "+destino+"\n"+
				"Ubicacion: "+piso+"\n"+
				"Calidad: "+calidadServicio+"\n"+
				"Servicios opcionales: "+serviciosOpcionales+"\n";
	}
}
