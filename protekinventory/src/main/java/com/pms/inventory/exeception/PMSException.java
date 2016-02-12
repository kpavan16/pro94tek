package com.pms.inventory.exeception;

public class PMSException extends java.lang.Exception {

   /** */
   public int code = 10000;

   /** */

   public PMSException (int exceptionCode, String message) {
      super(message);
      this.code = exceptionCode;
   }

   public PMSException (int exceptionCode, String message, Throwable cause) {
      super(message, cause);
      this.code = exceptionCode;
   }

   public PMSException (int exceptionCode, Throwable cause) {
      super(cause);
      this.code = exceptionCode;
   }

   public int getCode () {
      return this.code;
   }

}
