package com.pms.security.bean;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum UserStatus {
   ACTIVE ("A"), INACTIVE ("I"), DELETE ("D");

   private String                               value;
   private static final Map<String, UserStatus> reverseLookupMap = new HashMap<String, UserStatus>();

   static {
      for (UserStatus userStatus : EnumSet.allOf(UserStatus.class)) {
         reverseLookupMap.put(userStatus.value, userStatus);
      }
   }

   UserStatus (String value) {
      this.value = value;
   }

   public String getValue () {
      return this.value;
   }

   public static UserStatus getType (String value) {
      return reverseLookupMap.get(value);
   }

}
