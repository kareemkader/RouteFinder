package Loader;
import java.io.*;

import SubWay.Subway;

public class LoadTester {

	public static void main(String[] args) {
		
	try {
		File file =new File("/home/kareemkaz/Desktop/subwayData.txt");
		SubWayLoader subloader=new SubWayLoader();
		Subway subway=subloader.loadFromFile(file);
		System.out.println("testing starting now !!");
		if(subway.hasStation("Uml Walk")&&subway.hasStation("Lsp Lane"))System.out.println("test passed");
		else System.out.println("test failed");
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
		
		
	}

	public String testingLoadStation()
	
}
