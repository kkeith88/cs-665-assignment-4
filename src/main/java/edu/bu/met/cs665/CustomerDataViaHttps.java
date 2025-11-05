/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/04/2025
 * File Name: CustomerDataViaHttps.java
 * Description: Interface for accessing customer data via HTTPS
 */

package edu.bu.met.cs665;

/**
 * New System
 * This file was copied over from the professors repository
 * Defines the interface for accessing customer data via HTTPS
 * Concerete classes will have to implement these methods
 */
public interface CustomerDataViaHttps {
    void printCustomer(int customerId);

    Customer getCustomerViaHttps(int customerId);
}

