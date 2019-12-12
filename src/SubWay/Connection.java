package SubWay;

public class Connection {


	private Station station1,station2;
	private String lineName;
	
	public Connection(String name,Station station1,Station station2) {
		this.lineName=name;
		this.station1=station1;
		this.station2=station2;
	}
	
	public String getLineName() {
		return lineName;
	}
	
	public Station getStation1() {
		return station1;
	}

	public Station getStation2() {
		return station2;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lineName == null) ? 0 : lineName.hashCode());
		result = prime * result + ((station1 == null) ? 0 : station1.hashCode());
		result = prime * result + ((station2 == null) ? 0 : station2.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Connection other = (Connection) obj;
		if (lineName == null) {
			if (other.lineName != null)
				return false;
		} else if (!lineName.equalsIgnoreCase(other.lineName))
			return false;
		if (station1 == null) {
			if (other.station1 != null)
				return false;
		} else if (!station1.equals(other.station1))
			return false;
		if (station2 == null) {
			if (other.station2 != null)
				return false;
		} else if (!station2.equals(other.station2))
			return false;
		return true;
	}
	
}
