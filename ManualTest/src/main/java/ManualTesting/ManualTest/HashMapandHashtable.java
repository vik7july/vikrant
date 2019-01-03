package ManualTesting.ManualTest;

public class HashMapandHashtable {/*
The Most important difference between HashMap and the Hashtable is that Hashtable is synchronized and HashMap is non-synchronized , which means Hashtable is thread-safe and can be shared among multiple threads and you don’t need to worry about the synchronization problems. As only one thread can access the Hashtable at a time whereas Hashmap is not thread-safe and it cannot be shared between threads without synchronization. You can synchronize the HashMap using this below code.
Map m = Collections.synchronizedMap(hashMap);
HashMap permits one null key and multiple null values whereas the Hashtable will not allow null key or value.
Since the Hashtable is thread-safe it is comparatively slower than the HashMap in the environment where Synchronization factor is not considered.
HashMap can be traversed by using the iterator, whereas the Hashtable can be traversed by using enumerator and iterator.
HashMap inherits AbstractMap class and Hashtable inherits Dictionary class.

Smoke Testing	Sanity Testing
Smoke Testing is performed to ascertain that the critical functionalities of the program is working fine	Sanity Testing is done to check the new functionality/bugs have been fixed
The objective of this testing is to verify the "stability" of the system in order to proceed with more rigorous testing	The objective of the testing is to verify the "rationality" of the system in order to proceed with more rigorous testing
This testing is performed by the developers or testers	Sanity testing is usually performed by testers
Smoke testing is usually documented or scripted	Sanity testing is usually not documented and is unscripted
Smoke testing is a subset of Acceptance testing	Sanity testing is a subset of Regression Testing
Smoke testing exercises the entire system from end to end	Sanity testing exercises only the particular component of the entire system
Smoke testing is like General Health Check Up	Sanity Testing is like specialized health check up

*system testing: The process of testing an integrated system to verify that it meets specified requirements.
*INTEGRATION TESTING is a level of software testing where individual units are combined and tested as a group. The purpose of this level of testing is to expose faults in the interaction between integrated units. Test drivers and test stubs are used to assist in Integration Testing.
*ACCEPTANCE TESTING is a level of software testing where a system is tested for acceptability. The purpose of this test is to evaluate the system’s compliance with the business requirements and assess whether it is acceptable for delivery.
*
*Unit Testing It is performed by using the White Box Testing method.

When is it performed?

Unit Testing is the first level of software testing and is performed prior to Integration Testing.

Who performs it?

It is normally performed by software developers themselves or their peers. In rare cases, it may also be performed by independent software testers.
*
*
* In Black Box Testing, the internal structure of the item being tested is unknown to the tester and in White Box Testing the internal structure is known. In Gray Box Testing, the internal structure is partially known. This involves having access to internal data structures and algorithms for purposes of designing the test cases, but testing at the user, or black-box level.

Gray Box Testing is named so because the software program, in the eyes of the tester is like a gray/semi-transparent box; inside which one can partially see.
*
*
* Selenium Artitecture
*Once you click on Run, every statement in your script will be converted as a URL with the help of JSON Wire Protocol over HTTP. The URL’s will be passed to the Browser Drivers. (In the above code, we took FirefoxDriver). Here in our case the client library (java) will convert the statements of the script to JSON format and communicates with the FirefoxDriver. URL looks as shown below.


http://localhost:8080/{"url":"https://www.softwaretestingmaterial.com"}
1
http://localhost:8080/{"url":"https://www.softwaretestingmaterial.com"}
Every Browser Driver uses a HTTP server to receive HTTP requests.  Once the URL reaches the Browser Driver, then the Browser Driver will pass that request to the real browser over HTTP. Then the commands in your selenium script will be executed on the browser.

If the request is POST request then there will be an action on browser

If the request is a GET request then the corresponding response will be generated at the browser end and it will be sent over HTTP to the browser driver and the Browser Driver over JSON Wire Protocol and sends it to the UI (Eclipse IDE).
*/
}
