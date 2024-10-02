package com.fpoly.java5.beans;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Image {
   
    private Optional<Integer> id;
    private String imageName;
    private Product product;
    private Boolean active;
}
