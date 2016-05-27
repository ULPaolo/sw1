
package dominio.com.bean;

public class Jugador {
	private String nombre;
	private String club;
	private String liga;
	private String nacionalidad;
	private String posicion;
	private int puntaje;
	private int tiro;
	private int pase;
	private int dribbling;
	private int defensa;
	private int fisico;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getClub() {
		return liga;
	}
	public void setClub(String club) {
		this.club = club;
	}
	
	public String getLiga() {
		return liga;
	}
	public void setLiga(String liga) {
		this.liga = liga;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public int getTiro() {
		return tiro;
	}
	public void setTiro(int tiro) {
		this.tiro = tiro;
	}
	public int getPase() {
		return pase;
	}
	public void setPase(int pase) {
		this.pase = pase;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public int getDribbling() {
		return dribbling;
	}
	public void setDribbling(int dribbling) {
		this.dribbling = dribbling;
	}
	public int getFisico() {
		return fisico;
	}
	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	public Jugador(String nombre, String club, String liga, String nacionalidad, String posicion, int puntaje, int tiro, int pase,
			int dribbling, int defensa, int fisico) {
		super();
		this.nombre = nombre;
		this.club = club;
		this.liga = liga;
		this.nacionalidad = nacionalidad;
		this.posicion = posicion;
		this.puntaje = puntaje;
		this.tiro = tiro;
		this.pase = pase;
		this.dribbling = dribbling;
		this.defensa = defensa;
		this.fisico = fisico;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", club=" + club + ", liga=" + liga + ", nacionalidad=" + nacionalidad
				+ ", posicion=" + posicion + ", puntaje=" + puntaje + ", tiro=" + tiro + ", pase=" + pase
				+ ", dribbling=" + dribbling + ", defensa=" + defensa + ", fisico=" + fisico + "]";
	}

	
	
}

