package SubWay;

import java.util.ArrayList;
import java.util.List;

public class Subway {

	private List<Station> stations;
	private List<Connection> connections;
	
//	private boolean flag;
	
	public Subway() {
		this.connections=new ArrayList<>();
		this.stations=new ArrayList<>();
	}
	
	public void addStation(String stationName) {
		
		if(!this.hasStation(stationName)) {
			
		stations.add(new Station(stationName));
		
		}		
			}
	
	public void addConnection(String connectionName,String station1name,String station2name) {
		if(this.hasStation(station1name)&&this.hasStation(station2name)) {
			Station station1=new Station(station1name);
			Station station2=new Station(station2name);
			Connection connection1=new Connection(connectionName, station1, station2);
			Connection connection2=new Connection(connectionName, station2, station1);
			connections.add(connection1);
			connections.add(connection2);
		}
		else {
			throw new RuntimeException();
		}
//		connections.add(new Connection(connectionName, new Station(station1), new Station(station2)));
	}
	
	public boolean hasStation(String stationName) {
		return stations.contains(new Station(stationName));
//		flag=false;
//		stations.forEach(station ->{ 
//			if(station.getName().equalsIgnoreCase(stationName))
//			{
//				flag=true;
//				
//			}
//				});
//		return flag;
	}
	
	public boolean hasConnection(String connecitonName,String station1Name,String station2Name) {
		return connections.contains(new Connection(connecitonName, new Station(station1Name), new Station(station2Name)));
	}




}
	

