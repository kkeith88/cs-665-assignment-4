/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/04/2025
 * File Name: UsbToHttpAdapter.java
 * Description: Adapter for accessing customer data via USB and HTTPS
 */

package edu.bu.met.cs665;

public class UsbToHttpsAdapter implements CustomerDataViaHttps {
  private CustomerDataViaUsb legacyUsbService;

  public UsbToHttpsAdapter(CustomerDataViaUsb legacyUsbService) {
    this.legacyUsbService = legacyUsbService;
  }

  /**
   * Print customer details by delegating to the legacy USB service
   * @param customerId
   */
  @Override
  public void printCustomer(int customerId) {
    legacyUsbService.printCustomer(customerId);
  }

  /**
   * Get customer details via HTTPS by delegating to the legacy USB service
   * @param customerId 
   * @return Customer object retrieved from the legacy USB service
   */
  @Override
  public Customer getCustomerViaHttps(int customerId) {
    return legacyUsbService.getCustomerViaUsb(customerId);
  }
    
}
