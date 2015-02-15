/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvfactory;

import factories.*;
import products.*;

/**
 *
 * @author Adam
 */
public class TvFactory {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    AbstractTvFactory factory = new Samsung();
    Tv makedTv = factory.makeTv(2);
    
    System.out.println("Manufactorer " + makedTv.getManufacturer().getName());
    System.out.println("TV model " + makedTv.getModel());
  }
  
}
