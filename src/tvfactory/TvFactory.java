/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvfactory;

import products.tvs.*;
import factories.*;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class TvFactory {

  /**
   * @param args the command line arguments
   * @throws java.lang.Exception
   */
  public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);
    System.out.println("Choose a manufacturer:\n1. LG\n2. Samsung\n3. Sony");
    int opt = Integer.parseInt(read.nextLine());
    AbstractTvFactory factory;
    //Create factory with options
    switch(opt){
      case 1:
        factory = new LG();
        break;
      case 2:
        factory = new Samsung();
        break;
      case 3:
        factory = new Sony();
        break;
      default:
        throw new Exception("WTF!!, you are very sick :(");
    }
    
    System.out.println("Choose a tv model:\n1. Car TV\n2. Airplane TV\n3. Home TV");
    opt = Integer.parseInt(read.nextLine());    
    Tv tvMade = factory.makeTv(opt);
    System.out.println("Manufacturer " + tvMade.getManufacturer().getName());
    System.out.println("TV model " + tvMade.getModel());
    System.out.println("Some operations");
    System.out.println(tvMade.on());
    System.out.println(tvMade.increaseVolume(5));
    System.out.println(tvMade.decreaseVolume(3));
    System.out.println(tvMade.off());
  }
  
}
