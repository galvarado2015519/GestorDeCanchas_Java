public class Cancha{
	
	int codigo;
	String nombreCancha;
	String estado;
	
	
	public Cancha(){
		
	}
	
	public Cancha (int codigo,String nombreCancha, String estado){
		this.codigo = codigo;
		this.nombreCancha = nombreCancha;
		this.estado = estado;
		
	}
	
	// métodos
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;	
	}
		
	public void setNombreCancha(String nombreCancha){
		this.nombreCancha = nombreCancha;
	}
	
	public String getNombreCancha(){
		return nombreCancha;	
	}		
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getEstado(){
		return estado;	
	}
	
	
}  