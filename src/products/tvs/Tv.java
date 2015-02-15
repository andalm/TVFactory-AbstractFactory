/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products.tvs;

import factories.AbstractTvFactory;
import products.interfaces.*;

/**
 *
 * @author Adam
 */
public abstract class Tv implements ITv{
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
  protected void setModel(String model) {
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
  protected void setManufacturer(AbstractTvFactory manufacturer) {
    this.manufacturer = manufacturer;
  }
}
