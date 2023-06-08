package mapper;

public class Avion {
	private int flightNumber;
	private double latitude;
	private double longitude;
	private int vitesse;
	private int altitude;
	private int cap;
	
	public Avion(int fn, double lat, double lon, int v, int alt, int c) {
		this.flightNumber = fn;
		this.latitude = lat;
		this.longitude = lon;
		this.vitesse = v;
		this.altitude = alt;
		this.cap = c;
	}
	public Pos getPosition() {
		return new Pos(this.latitude, this.longitude);
	}

	public String toString() {
		return "flightNumber:" + flightNumber + " - latitude : " + latitude
				+ " - longitude : " + longitude + " - vitesse : " + vitesse
				+ " - altitude : " + altitude + " - cap : " + cap;
	}

	public void avancerApres15Secondes() {
		// Calculer la distance parcourue en 15 secondes en fonction de la vitesse actuelle de l'avion
		double distance = (double) vitesse * 15 / 3600; // Convertir la vitesse de km/h à km/s

		// Calculer la nouvelle latitude et longitude en fonction du cap et de la distance parcourue
		double newLatitude = latitude + (distance * Math.cos(Math.toRadians(cap)));
		double newLongitude = longitude + (distance * Math.sin(Math.toRadians(cap)));

		// Mettre à jour la position de l'avion
		latitude = newLatitude;
		longitude = newLongitude;
	}

	// si c'est le cas il faut afficher les informations de l'avion sur la console (il faut créer une méthode afficher() dans la classe Pos)
	// je pense que je dois faire un thread ici pour que les avions avancent en même temps

	// peu etre c'est mieu de donner le temps en paramètre ...
	
}

