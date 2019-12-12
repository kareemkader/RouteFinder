package Loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import SubWay.Subway;

public class SubWayLoader {

	private Subway subway;
	
	public SubWayLoader() {
		this.subway=new Subway();
	}
	
	public Subway loadFromFile(File file) throws FileNotFoundException,IOException {
		BufferedReader reader=new BufferedReader(new FileReader(file));
		loadStations(subway, reader);
		String lineName=reader.readLine();
		while (lineName!=null&&lineName.length()>0) {
			
			loadLine(subway, reader, lineName);
			lineName=reader.readLine();
		}
		return subway;
	}
	
	private void loadStations(Subway subway,BufferedReader reader) throws IOException {
		String currentLine;
		currentLine=reader.readLine();
		while (currentLine.length()>0) {
			
			subway.addStation(currentLine);
			currentLine=reader.readLine();
			
		}
		
	}
	
	private void loadLine(Subway subway,BufferedReader reader ,String lineName) throws IOException {
		String station1,station2;
		station1=reader.readLine();
		station2=reader.readLine();
		
		while(station2!=null&&station2.length()>0) {
			subway.addConnection(lineName, station1, station2);
			station1=station2;
			station2=reader.readLine();
		}
	}
	
	
	
}
