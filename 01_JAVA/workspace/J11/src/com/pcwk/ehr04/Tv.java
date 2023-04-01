package com.pcwk.ehr04;

public class Tv {
   
   boolean power;   // 전원
   int channel;   // 채널

   public Tv() {
      
   }
   
   /**
    * 전원 ON or OFF
    */
   void power() {
      power = !power;   // 전원 on / off
   }
   
   /**
    * 채널 올리기
    */
   void channelUp() {
      ++channel;
   }
   
   /**
    * 채널 내리기
    */
   void channelDown() {
      --channel;
   }

}