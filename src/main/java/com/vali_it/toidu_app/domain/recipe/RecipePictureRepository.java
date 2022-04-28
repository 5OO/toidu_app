package com.vali_it.toidu_app.domain.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipePictureRepository extends JpaRepository<RecipePicture, Integer> {
}