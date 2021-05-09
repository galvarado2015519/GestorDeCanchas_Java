public class Equipo{
	
	int codigo;
	String nombreEquipo;
	String nombreCapitan;
	
	
	public Equipo(){
		
	}
	
	public Equipo(int codigo,String nombreEquipo, String nombreCapitan)	{
		this.codigo = codigo;
		this.nombreEquipo = nombreEquipo;
		this.nombreCapitan = nombreCapitan;
		
	}
	
	// métodos
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;	
	}
		
	public void setNombreEquipo(String nombreEquipo){
		this.nombreEquipo = nombreEquipo;
	}
	
	public String getNombreEquipo(){
		return nombreEquipo;	
	}		
	
	public void setNombreCapitan(String nombreCapitan){
		this.nombreCapitan = nombreCapitan;
	}
	
	public String getNombreCapitan(){
		return nombreCapitan;	
	}
	
	
}  