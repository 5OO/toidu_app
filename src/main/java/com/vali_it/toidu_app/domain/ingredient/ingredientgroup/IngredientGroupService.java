package com.vali_it.toidu_app.domain.ingredient.ingredientgroup;

import com.vali_it.toidu_app.service.ingredient.IngredientGroupDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IngredientGroupService {

    @Resource
    private IngredientGroupRepository ingredientGroupRepository;

    @Resource
    private IngredientGroupMapper ingredientGroupMapper;

    public IngredientGroupDto getIngredientGroupById(Integer id) {
        IngredientGroup ingredientGroup = ingredientGroupRepository.getById(id);
        return new IngredientGroupDto(ingredientGroup.getId(), ingredientGroup.getName());
    }

    public List<IngredientGroupDto> getAllIngredientGroup() {
        List<IngredientGroup> ingredientGroups = ingredientGroupRepository.findAll();
        return ingredientGroupMapper.toIngredientGroups(ingredientGroups);
    }
}
