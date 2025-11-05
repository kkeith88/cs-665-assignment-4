/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/04/2025
 * File Name: TestAdapter.java
 * Description: Class for testing adapter functionality
 */

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestAdapter {
    
    public TestAdapter() {
        //Empty Constructor
    }

    /**
     * Test getCustomerViaHttps method of the adapter
     */
    @Test
    public void testGetCustomerViaHttps() {
        CustomerDataViaUsb legacyUsbService = new LegacySystem();
        CustomerDataViaHttps adaptedService = new UsbToHttpsAdapter(legacyUsbService);
        Customer customer = adaptedService.getCustomerViaHttps(1);
        assertNotNull(customer);
        assertEquals("John Doe", customer.getName());
        assertEquals("john.doe@example.com", customer.getEmail());
    }

    /**
     * Test printCustomer method of the adapter
     */
    @Test
    public void testPrintCustomer() {
        CustomerDataViaUsb legacyUsbService = new LegacySystem();
        CustomerDataViaHttps adaptedService = new UsbToHttpsAdapter(legacyUsbService);
        adaptedService.printCustomer(1);
        // Since printCustomer only prints to console, we can't assert its output here.
    }

    /**
     * Test getCustomerViaHttps with invalid customer ID
     */
    @Test
    public void testGetCustomerViaHttpsWithInvalidId() {
        CustomerDataViaUsb legacyUsbService = new LegacySystem();
        CustomerDataViaHttps adaptedService = new UsbToHttpsAdapter(legacyUsbService);
        Customer customer = adaptedService.getCustomerViaHttps(9999);
        assertNull(customer);
    }
}