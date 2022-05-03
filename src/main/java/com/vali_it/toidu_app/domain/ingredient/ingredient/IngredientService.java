package com.vali_it.toidu_app.domain.ingredient.ingredient;


import com.sun.xml.bind.v2.TODO;
import com.vali_it.toidu_app.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Resource
    private IngredientRepository ingredientRepository;

    @Resource
    private IngredientMapper ingredientMapper;

    @Resource
    private ValidationService validationService;

    public List<IngredientDto> getAllIngredients() {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        return ingredientMapper.toIngredients(ingredients);
    }

    public List<IngredientDto> findIngredientIdByName(String name) {
        List<Ingredient> ingredients = ingredientRepository.findIngredientByName(name);
        return ingredientMapper.toIngredients(ingredients);
    }

    public IngredientDto addNewIngredient(IngredientDto ingredientDto) {
        Ingredient ingredient = ingredientMapper.ingredientDtoToIngredient(ingredientDto);
        // TODO: 03.05.2022  VAJA TEHA VALIDATION
        ingredientRepository.save(ingredient);
        return ingredientMapper.ingredientToIngredientDto(ingredient);
    }

    public IngredientDto findIngredientById(Integer id) {
        Ingredient ingredient = ingredientRepository.getById(id);
        return ingredientMapper.ingredientToIngredientDto(ingredient);
    }

    public void removeIngredientById(Integer id) {
        Ingredient ingredient = findIngredientById(id);
        ingredientRepository.deleteById((ingredient.));
        customerRepository.deleteById(customer.getId());
    }



//    private Ingredient getValidIngredientById(Integer ingredientId) {
//        Optional<Ingredient> ingredient = ingredientRepository.findById(ingredientId);
//        validationService.ingredientExists(ingredientId, ingredient);
//        return ingredient.get();
//    }


}

