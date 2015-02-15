/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import products.tvs.*;

/**
 *
 * @author Adam
 */
public abstract class AbstractTvFactory {
  private String name;
  
  public Tv makeTv(int type) {
     Tv tvMade;
    switch(type){
      case 1:
        tvMade = new CarTv(this);
        break;
      case 2:
        tvMade = new AirplaneTv(this);
        break;
      default:
        tvMade = new HomeTv(this);
    }
    return tvMade;
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
