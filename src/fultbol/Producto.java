public class Producto{
	
	int codigo;
	String nombre;
	int cantidad;
	double precio;
	
	public Producto(){
		
	}
	
	public Producto(int codigo,String nombre,int cantidad,double precio){
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	// métodos
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return codigo;	
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setCantidad(int cantidad){
		this.cantidad = cantidad;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	public void setPrecio(double precio){
		this.precio = precio;
	}
	
	public double getPrecio(){
		return precio;
	}
	
}  