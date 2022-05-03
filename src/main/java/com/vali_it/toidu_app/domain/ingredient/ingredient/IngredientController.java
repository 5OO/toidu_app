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
    public List<IngredientDto> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/id")
    @Operation(summary = "leiab ingredientsi id järgi")
    public IngredientDto getIngredientById(@RequestParam Integer id) {
        return ingredientService.getIngredientById(id);
    }

    @GetMapping("/find")
    @Operation(summary = "leiab ingredienti nime kaudu")
    public List<IngredientDto> findIngredientIdByName(@RequestParam String name) {
        return ingredientService.findIngredientIdByName(name);
    }

    @PostMapping("/create")
    @Operation(summary = "lisab uue toitaine")
    public IngredientDto addNewIngredient(@Valid @RequestBody IngredientDto ingredientDto) {
        return ingredientService.addNewIngredient(ingredientDto);
    }

    @DeleteMapping("/id")
    @Operation(summary = "kustutab ingredienti id järgi")
    public void removeIngredientById(@RequestParam Integer id) {
        ingredientService.removeIngredientById(id);
    }

    @PutMapping("/id")
    @Operation(summary = "uuendab ingredienti id järgi")
    public void updateIngredientById(@RequestParam Integer id, @RequestBody IngredientDto ingredientDto) {
        ingredientService.updateIngredientById(id, ingredientDto);
    }
}
