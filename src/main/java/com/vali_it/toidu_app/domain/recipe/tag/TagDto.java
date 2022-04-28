package com.vali_it.toidu_app.domain.recipe.tag;

import lombok.Data;

import java.io.Serializable;

@Data
public class TagDto implements Serializable {
    private final Integer id;
    private final String description;
}
