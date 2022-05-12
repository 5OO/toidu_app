package com.vali_it.toidu_app.service.ingredient;


import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import com.vali_it.toidu_app.service.ingredient.IngredientService;
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
    @Operation(summary = "leiab kõik toiduained (ingredientid) ")
    public List<IngredientRequest> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/id")
    @Operation(summary = "leiab ingredientsi id järgi")
    public IngredientRequest getIngredientById(@RequestParam Integer id) {
        return ingredientService.getIngredientById(id);
    }

    @GetMapping("/info")
    @Operation(summary = "leiab ingredientsi id järgi")
    public IngredientInfoDto getIngredientInfoById(@RequestParam Integer id) {
        return ingredientService.getIngredientInfoById(id);
    }

    @GetMapping("/find")
    @Operation(summary = "leiab andmebaasist toiduaineid (ingrediendid) osalise nime kaudu")
    public List<IngredientRequest> findIngredientIdByName(@RequestParam String name) {
        return ingredientService.findIngredientIdByName(name);
    }

    @PostMapping("/create")
    @Operation(summary = "lisab uue toiduaine (ingredient)")
    public IngredientRequest addNewIngredient(@Valid @RequestBody IngredientRequest ingredientRequest) {
        return ingredientService.addNewIngredient(ingredientRequest);
    }

    @DeleteMapping("/id")
    @Operation(summary = "kustutab toiduaine (ingredient) ID järgi")
    public void removeIngredientById(@RequestParam Integer id) {
        ingredientService.removeIngredientById(id);
    }

    @PutMapping("/id")
    @Operation(summary = "uuendab ingredienti ID järgi")
    public void updateIngredientById(@RequestParam Integer id, @RequestBody IngredientRequest ingredientRequest) {
        ingredientService.updateIngredientById(id, ingredientRequest);
    }
}
