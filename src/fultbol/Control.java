public class Control{
	
	int codigo;
	String equipo;
	String canchas;
	String asignacion;
	String reporte;
	
	
	public Control(){
		
	}
	
	public Control(int codigo,String equipo,String canchas,String asignacion,String reporte);{
		this.codigo = codigo;
		this.equipo = equipo;
		this.canchas = canchas;
		this.asignacion = asignacion;
		this.reporte = reporte;
	}
	
	// métodos
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;	
	}
	
	public void setEquipo(String equipo){
		this.equipo = equipo;
	}
	
	public String getequipo(){
		return equipo;
	}
	
	public void setCanchas(String canchas){
		this.canchas = canchas;
	}
	
	public String getcanchas(){
		return canchas;
	}
	
	public void setAsignacion(String asignacion){
		this.asignacion = asignacion;
	}
	
	public String getasignacion(){
		return asignacion;
	}
	
	public void setReporte(String reporte){
		this.reporte = reporte;
	}
	
	public String getreporte(){
		return reporte;
	}
	
	
}  