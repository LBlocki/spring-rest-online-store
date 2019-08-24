package com.blocki.springrestonlinestore.api.v1.controllers;

import com.blocki.springrestonlinestore.api.v1.models.CategoryDTO;
import com.blocki.springrestonlinestore.api.v1.models.CategoryListDTO;
import com.blocki.springrestonlinestore.core.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(CategoryController.CATEGORIES_BASIC_URL)
public class CategoryController {

    public final static String CATEGORIES_BASIC_URL = "/api/v1/categories";

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {

        this.categoryService = categoryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getAllCategories() {

        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryById(@PathVariable Long id) {

        return categoryService.getCategoryById(id);
    }
}