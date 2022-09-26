
public class Cliente implements Autenticable {

	private String nombre;
	private String documento;
	private String Profesion;
	
	private AutenticacionUtil util;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getProfesion() {
		return this.Profesion;
	}

	public void setProfesion(String profesion) {
		Profesion = profesion;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
