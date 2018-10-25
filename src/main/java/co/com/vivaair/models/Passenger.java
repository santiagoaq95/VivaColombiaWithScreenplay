package co.com.vivaair.models;



/**
 * @author Santiagoaq95
 *
 */

//Model de numero de pasajeros 
public class Passenger {
	private int adults;
	private int children;
	private int infants;
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public int getInfants() {
		return infants;
	}
	public void setInfants(int infants) {
		this.infants = infants;
	}
	
}
