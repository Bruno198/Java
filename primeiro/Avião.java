package primeiro;

public class Avi�o extends Ve�culo{
	int altitude;
	
	public int mudar_altitude() {
		//while (this.altitude != 10.00) {
	//		System.out.println("Altitude" + altitude + "Metros");
			this.altitude = this.altitude + 300;
		return altitude;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
}
