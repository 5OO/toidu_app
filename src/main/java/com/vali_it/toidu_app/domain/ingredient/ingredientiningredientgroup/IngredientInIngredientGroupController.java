package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class IngredientInIngredientGroupController {

    @Resource
    private IngredientInIngredientGroupService ingredientInIngredientGroupService;

    @GetMapping("/ingredients")
    private List<IngredientInIngredientGroupDto> getIngredientByIngredientGroupId(@RequestParam Integer id) {
        return ingredientInIngredientGroupService.getIngredientByIngredientGroupId(id);
    }
}
