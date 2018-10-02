package managers;

import dataProvider.ConfigFileReader;

//Singleton design pattern to create one object of class
// Private constructor to restrict instance of class from another class
//Private static variable which is only instance of class
//public static method that return instance of class, global acces to get access of singleton class
public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	// Private constructor
	private FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;

	}

	public ConfigFileReader getConfigFileReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;

	}
}
/*
 * The FileReaderManager class maintains a static reference to its own instance
 * and returns that reference from the static getInstance() method.
 * FileReaderManager implements a private constructor so clients cannot
 * instantiate FileReaderManager instances. getConfigReader() method returns the
 * instance of the ConfigFileReader but this method is not static. So that
 * client has to use the getInstance() method to access other public methods of
 * the FileReaderManager like FileReaderManager.getInstance().getConfigReader()
 */