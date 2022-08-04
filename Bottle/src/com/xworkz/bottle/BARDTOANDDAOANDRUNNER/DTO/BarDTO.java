package com.xworkz.bottle.BARDTOANDDAOANDRUNNER.DTO;



import java.io.Serializable;

import com.xworkz.bottle.BARDTOANDDAOANDRUNNER.CONSTANTS.BarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 @Getter
 @Setter
 @ToString
 @NoArgsConstructor
 @AllArgsConstructor
public class BarDTO implements Serializable{
      private Integer id;
      private String name;
      private String location;
      private BarType type = BarType.MSIL;
      private Double avgCollectionPerDay;
      private Double collectionPerMonth;
      
      
}
