/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import products.*;

/**
 *
 * @author Adam
 */
public abstract class AbstractTvFactory {
  private String name;
  
  public Tv makeTv(int type) {
     Tv madeTv;
    switch(type){
      case 1:
        madeTv = new CarTv(this);
        break;
      case 2:
        madeTv = new AirplaneTv(this);
        break;
      default:
        madeTv = new HomeTv(this);
    }
    return madeTv;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  
}
