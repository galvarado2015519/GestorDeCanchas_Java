import java.util.Date;

public class Asignacion{
	
	int codigo;
    int equipoCodigo1;
    int equipoCodigo2;
	int canchaCodigo;
	String equipoNombre1;
	String equipoNombre2;
	String canchaNombre;
    Date dateTime;
	
	public Asignacion(){
		
	}
	
	public Asignacion(int codigo, int equipoCodigo1, int equipoCodigo2, int canchaCodigo, String equipoNombre1, String equipoNombre2, String canchaNombre, Date dateTime){
		this.codigo = codigo;
		this.equipoCodigo1 = equipoCodigo1;
		this.equipoCodigo2 = equipoCodigo2;
		this.canchaCodigo = canchaCodigo;
		this.equipoNombre1 = equipoNombre1;
		this.equipoNombre2 = equipoNombre2;
		this.canchaNombre = canchaNombre;
		this.dateTime = dateTime;
	}
	
	// métodos
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;	
	}
		
	public void setEquipoCodigo1(int equipoCodigo1){
		this.equipoCodigo1 = equipoCodigo1;
	}
	
	public int getEquipoCodigo1(){
		return equipoCodigo1;	
	}		
	
	public void setEquipoCodigo2(int equipoCodigo2){
		this.equipoCodigo2 = equipoCodigo2;
	}
	
	public int getEquipoCodigo2(){
		return equipoCodigo2;	
	}	
	
	public void setCanchaCodigo(int canchaCodigo){
		this.canchaCodigo = canchaCodigo;
	}
	
	public int getCanchaCodigo(){
		return canchaCodigo;	
	}
	
	public void setDateTime(Date datetime) {
		this.dateTime = datetime;
	}
	
	public Date getDateTime() {
		return dateTime;
	}
	
	public void setEquipoNombre1(String equipoNombre1){
		this.equipoNombre1 = equipoNombre1;
	}
	
	public String getEquipoNombre1(){
		return equipoNombre1;	
	}
	
	public void setEquipoNombre2(String equipoNombre2){
		this.equipoNombre2 = equipoNombre2;
	}
	
	public String getEquipoNombre2(){
		return equipoNombre2;	
	}
	
	public void setCanchaNombre(String canchaNombre){
		this.canchaNombre = canchaNombre;
	}
	
	public String getCanchaNombre(){
		return canchaNombre;	
	}
	
}  