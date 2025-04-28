package clase;

public class Veterinaria {
	private String nombreCliente, nombreMascota, raza, sexo;
	private double  PrecioXConsulta = 35;
	private int telefono, dni;
	public Veterinaria(String nombreCliente, String nombreMascota, String raza, String sexo, double precioXConsulta,
			int telefono, int dni) {
		
		this.nombreCliente = nombreCliente;
		this.nombreMascota = nombreMascota;
		this.raza = raza;
		this.sexo = sexo;
		PrecioXConsulta = precioXConsulta;
		this.telefono = telefono;
		this.dni = dni;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPrecioXConsulta() {
		return PrecioXConsulta;
	}
	public void setPrecioXConsulta(double precioXConsulta) {
		PrecioXConsulta = precioXConsulta;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double MontoTotal() {
		return PrecioXConsulta + (PrecioXConsulta * 0.18);
	}
}
