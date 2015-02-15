/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import factories.AbstractTvFactory;

/**
 *
 * @author Adam
 */
public abstract class Tv {
  private String model;
  private AbstractTvFactory manufacturer;

  /**
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * @param model the model to set
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * @return the manufacturer
   */
  public AbstractTvFactory getManufacturer() {
    return manufacturer;
  }

  /**
   * @param manufacturer the manufacturer to set
   */
  public void setManufacturer(AbstractTvFactory manufacturer) {
    this.manufacturer = manufacturer;
  }
}
