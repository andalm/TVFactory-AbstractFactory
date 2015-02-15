/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package products;

import factories.AbstractTvFactory;
import products.interfaces.ITv;

/**
 *
 * @author Adam
 */
public class CarTv extends Tv implements ITv {
  
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

  @Override
  public String raiseVolume() {
    return "Rise volume";
  }

  @Override
  public String decreaseVolume() {
    return "Decrease volume";
  }
  
}
