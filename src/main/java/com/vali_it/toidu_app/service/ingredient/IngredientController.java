package com.vali_it.toidu_app.domain.ingredient.ingredient;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    @Resource
    private IngredientService ingredientService;

    @GetMapping("/all")
    @Operation(summary = "leiab kõik ingredientsid")
    public List<IngredientRequest> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/id")
    @Operation(summary = "leiab ingredientsi id järgi")
    public IngredientRequest getIngredientById(@RequestParam Integer id) {
        return ingredientService.getIngredientById(id);
    }

    @GetMapping("/find")
    @Operation(summary = "leiab ingredienti nime kaudu")
    public List<IngredientRequest> findIngredientIdByName(@RequestParam String name) {
        return ingredientService.findIngredientIdByName(name);
    }

    @PostMapping("/create")
    @Operation(summary = "lisab uue toitaine")
    public IngredientRequest addNewIngredient(@Valid @RequestBody IngredientRequest ingredientRequest) {
        return ingredientService.addNewIngredient(ingredientRequest);
    }

    @DeleteMapping("/id")
    @Operation(summary = "kustutab ingredienti id järgi")
    public void removeIngredientById(@RequestParam Integer id) {
        ingredientService.removeIngredientById(id);
    }

    @PutMapping("/id")
    @Operation(summary = "uuendab ingredienti id järgi")
    public void updateIngredientById(@RequestParam Integer id, @RequestBody IngredientRequest ingredientRequest) {
        ingredientService.updateIngredientById(id, ingredientRequest);
    }
}
