/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products.tvs;

import factories.AbstractTvFactory;

/**
 *
 * @author Adam
 */
public class CarTv extends Tv {
  
  public CarTv(AbstractTvFactory manufacturer){
    super.setModel("Car TV");
    super.setManufacturer(manufacturer);
  }
  
  @Override
  public String on() {
    return "TV on";
  }

  @Override
  public String off() {
    return "TV off";
  }

   /**
   *
   * @param value the value of value
   */
  @Override
  public String increaseVolume(int value) {
    return "Increase volume " + value;
  }

  /**
   *
   * @param value the value of value
   */
  @Override
  public String decreaseVolume(int value) {
    return "Decrease volume " + value;
  }
  
}
