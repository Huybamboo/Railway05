package com.vti.utils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is used for accessing properties file.
 * 
 * @Description: .
 * @author: DangBlack
 * @create_date: May 26, 2020
 * @version: 1.0
 * @modifer: DangBlack
 * @modifer_date: May 26, 2020
 */
public class DatabaseProperties {

	public static final String RESOURCE_FOLDER_URL = "C:\\Users\\pc\\eclipse-workspace\\TestingSystem_Assignment_11_Exercise_2\\src\\main\\java\\resources\\";

	private Properties properties;

	public DatabaseProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_FOLDER_URL + "database.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}