package com.example.hypermarketapi.entity;

import java.util.List;
import lombok.Data;

@Data
public class ShopUnitStatisticResponse {

  private List<ShopUnitStatisticUnit> items;
}
