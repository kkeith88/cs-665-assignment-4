/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/04/2025
 * File Name: CustomerDataViaUsb.java
 * Description: Interface for accessing customer data via USB
 */

package edu.bu.met.cs665;

/**
 * Legacy System
 * This file was copied over from the professors repository
 * Defines the interface for accessing customer data via USB
 * Concrete classes will have to implement these methods
 */
public interface CustomerDataViaUsb {
    void printCustomer(int customerId);
  
    Customer getCustomerViaUsb(int customerId);
}

