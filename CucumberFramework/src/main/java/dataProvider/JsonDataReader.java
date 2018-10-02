package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import testDataTypes.Customer;
import com.google.gson.Gson;
import managers.FileReaderManager;
//GSON uses Java Reflection to provide simple methods to JSON to JAVA and viseversa

public class JsonDataReader {
	private final String customerFilePath = FileReaderManager.getInstance().getConfigFileReader()
			.getTestDataResourcePath() + "Customer.json";
	private List<Customer> customerList;

	public JsonDataReader() {
		customerList = getCustomerData();
	}

	private List<Customer> getCustomerData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerFilePath));
			Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
			return Arrays.asList(customers);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerFilePath);
		} finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
			} catch (IOException ignore) {
			}
		}
	}

	public final Customer getCustomerByName(String customerName) {
		for (Customer customer : customerList) {
			if (customer.firstName.equalsIgnoreCase(customerName))
				return customer;
		}
		return null;
	}

}
/*
 * Method getInstance() is called factory method. It is used for singleton class
 * creation. That means only one instance of that class will be created and
 * others will get reference of that class.
 */