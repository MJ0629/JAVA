package com.mycompany.study.ch15.fifth;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		
		String path  = ExProperties.class.getResource("properties.properties").getPath();
		
			FileReader fileReader = new FileReader(path);
		
		properties.load(fileReader);
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String name = properties.getProperty("name");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("name : " + name);
		System.out.println("password : " + password);
	}

}
