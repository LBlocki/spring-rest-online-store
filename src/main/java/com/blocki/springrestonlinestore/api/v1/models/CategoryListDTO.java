package com.blocki.springrestonlinestore.api.v1.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryListDTO {

    @JsonProperty("categories")
    @NotBlank(message = "field value cannot be null or contain only blank characters")
    private List<CategoryDTO>  categoryDTOs = new ArrayList<>();
}
