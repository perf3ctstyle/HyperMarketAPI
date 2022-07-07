package com.example.hypermarketapi.entity;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class ShopUnitImportRequest {

  private List<ShopUnitImport> items;
  private LocalDateTime updateDate;
}
