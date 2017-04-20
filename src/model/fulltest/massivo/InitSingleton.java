///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package model.fulltest.massivo;
//
//import javax.ejb.Singleton;
//
///**
// *
// * @author G0042204
// */
//@Singleton
//public class InitSingleton {
//
//    private static InitSingleton initSingleton = null;
//    
//    private Boolean threadsOn = false;
//
//    public Boolean getThreadsOn() {
//        return threadsOn;
//    }
//
//    public void setThreadsOn(Boolean threadsOn) {
//        this.threadsOn = threadsOn;
//    }
//
//   /* A private Constructor prevents any other
//    * class from instantiating.
//    */
//   protected InitSingleton() {
//   }
//
//   /* Static 'instance' method */
//   public static InitSingleton getInstance( ) {
//       if(initSingleton == null){
//         initSingleton = new InitSingleton( );
//       }
//      return initSingleton;
//   }
//
//   /* Other methods protected by singleton-ness */
//   protected static void demoMethod( ) {
//      System.out.println("");
//   }
//
//}
