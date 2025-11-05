/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/04/2025
 * File Name: LegacySystem.java
 * Description: Legacy system implementation for customer data access via USB
 */

package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class LegacySystem implements CustomerDataViaUsb {
    /**
     * The use case of this map is to simulate a usb storage system
     * Need to be able to simulate a null return when customer is not found
     * Rather than just returning a dummy customer every time
     */ 
    private Map<Integer, Customer> usbStorage = new HashMap<>();

    public LegacySystem() {
        // Example data to store, pretend it is in the usb storage
        usbStorage.put(1, new Customer("John Doe", "john.doe@example.com"));
        usbStorage.put(2, new Customer("Allen Zee", "allen@example.com"));
        usbStorage.put(3, new Customer("Joe Smith", "joe@example.com"));
    }

    /**
     * Print customer details fetched via USB
     * @param customerId
     */
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Fetching customer data from legacy USB system...");
        Customer c = usbStorage.get(customerId);
        if (c != null) {
            System.out.println("Customer via USB: " + c);
        } else {
            System.out.println("Customer ID " + customerId + " not found on USB.");
        }
    }

    /**
     * Get customer details via USB
     * @param customerId
     * @return Customer object
     */
    @Override
    public Customer getCustomerViaUsb(int customerId) {
        // Simulate fetching customer data from a legacy system via USB
        System.out.println("Fetching customer data for customer ID: " + customerId + " via USB.");
        if (!usbStorage.containsKey(customerId)) {
            System.out.println("Customer ID " + customerId + " not found on USB.");
            return null;
        }
        return usbStorage.get(customerId);
    }
}
