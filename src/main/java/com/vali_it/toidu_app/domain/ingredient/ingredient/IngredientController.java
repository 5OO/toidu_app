package com.vali_it.toidu_app.domain.ingredient.ingredient;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Resource
    private IngredientService ingredientService;

    @GetMapping("/all")
    public List<IngredientDto> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

//    @GetMapping("/find")
//    public List<IngredientDto> findIngredientByName(@RequestParam Integer id) {
//        return ingredientService.findIngredientById(id);
//    }
}
