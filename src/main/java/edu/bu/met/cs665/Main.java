/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/04/2025
 * File Name: Main.java
 * Description: Entry point for the application
 */

package edu.bu.met.cs665;


/**
 * This is the Main class.
 */
public class Main {
  public static void main(String[] args) {
    // Create an instance of the legacy USB service
    CustomerDataViaUsb legacyUsbService = new LegacySystem();
    // Create the adapter to use the legacy USB service via HTTPS
    CustomerDataViaHttps adaptedService = new UsbToHttpsAdapter(legacyUsbService);

    // Now you can use the adaptedService to access the legacy USB service via HTTPS
    adaptedService.printCustomer(1);
    Customer customer = adaptedService.getCustomerViaHttps(1);
    System.out.println("Customer Name: " + customer.getName());
    System.out.println("Customer Email: " + customer.getEmail());

    // Testing with an invalid customer ID
    Customer customer1 = adaptedService.getCustomerViaHttps(9999);
    if(customer1 != null){
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Customer Email: " + customer1.getEmail());
    } else {
        System.out.println("Customer not found.");
    }

  }
}