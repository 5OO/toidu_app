package com.vali_it.toidu_app.domain.ingredient.ingredientgroup;

import com.vali_it.toidu_app.service.ingredient.IngredientGroupDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientGroupController {

    @Resource
    private IngredientGroupService ingredientGroupService;


    @GetMapping("/id")
    @Operation(summary = "näita ingredient groupi id järgi")
    private IngredientGroupDto getIngredientGroupById(@RequestParam Integer id) {
        return ingredientGroupService.getIngredientGroupById(id);
    }

    @GetMapping("/all")
    @Operation(summary = "näita kõiki ingredient groupe")
    private List<IngredientGroupDto> getAllIngredientGroup() {
        return ingredientGroupService.getAllIngredientGroup();
    }

}
