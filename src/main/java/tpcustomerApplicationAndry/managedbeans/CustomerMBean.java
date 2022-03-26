/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package tpcustomerApplicationAndry.managedbeans;

import fr.grin.tpcustomerapplicationandry.entities.Customer;
import fr.grin.tpcustomerapplicationandry.session.CustomerManager;
import javax.ejb.EJB;  
import javax.inject.Named;  
import javax.faces.view.ViewScoped;  
import java.io.Serializable;  
import java.util.List;  

/**
 *
 * @author Pc
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {  
  private List<Customer> customerList;  

  @EJB
  private CustomerManager customerManager;  
        
  public CustomerMBean() {  }  
        
  /** 
   * Retourne la liste des clients pour affichage dans une DataTable 
   * @return 
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}
