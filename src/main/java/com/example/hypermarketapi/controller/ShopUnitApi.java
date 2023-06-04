package com.example.hypermarketapi.controller;

import com.example.hypermarketapi.entity.Error;
import com.example.hypermarketapi.entity.ShopUnitImport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Tag(name = "Shop Unit API")
public interface ShopUnitApi {

  @Operation(
      summary = "Import new products and/or categories(shop units)",
      tags = {"Shop Units", "Products", "Categories"},
      description =
          "Import of products and/or categories(shop units). "
              + "Products and categories(shop units) that are imported repeatedly update "
              + "the currently existing ones.")
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "200", description = "Shop Units successfully imported."),
        @ApiResponse(
            responseCode = "400",
            description = "Invalid document schema or input data is not correct.",
            content = @Content(schema = @Schema(implementation = Error.class)))
      })
  @PostMapping("/imports")
  @ResponseStatus(HttpStatus.OK)
  ResponseEntity<?> imports(@RequestBody ShopUnitImport shopUnitImport);

  @Operation(
      summary = "Delete a product or category(shop unit) by its id",
      tags = {"Shop Units", "Products", "Categories"},
      description =
          "Deletion of a product or a category(shop unit) by its id. "
              + "When deleting a category all of its child elements get deleted as well.")
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "200", description = "Shop Unit successfully deleted."),
        @ApiResponse(
            responseCode = "400",
            description = "Invalid document schema or input data is not correct.",
            content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(
            responseCode = "404",
            description = "A product or a category wasn't found.",
            content = @Content(schema = @Schema(implementation = Error.class)))
      })
  @DeleteMapping("/delete/{id}")
  @ResponseStatus(HttpStatus.OK)
  ResponseEntity<?> delete(@PathVariable UUID id);

  @Operation(
      summary = "",
      tags = {"Shop Units", "Products", "Categories"},
      description = "")
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "200", description = "Shop Unit successfully returned."),
        @ApiResponse(
            responseCode = "400",
            description = "Invalid document schema or input data is not correct.",
            content = @Content(schema = @Schema(implementation = Error.class))),
        @ApiResponse(
            responseCode = "404",
            description = "A product or a category wasn't found.",
            content = @Content(schema = @Schema(implementation = Error.class)))
      })
  @GetMapping("/nodes/{id}")
  @ResponseStatus(HttpStatus.OK)
  ResponseEntity<?> get(@PathVariable UUID id);
}
