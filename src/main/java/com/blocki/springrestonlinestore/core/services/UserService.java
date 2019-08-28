package com.blocki.springrestonlinestore.core.services;

import com.blocki.springrestonlinestore.api.v1.models.ProductDTO;
import com.blocki.springrestonlinestore.api.v1.models.ShoppingCartDTO;
import com.blocki.springrestonlinestore.api.v1.models.UserDTO;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;

public interface UserService {

    Resources<Resource<UserDTO>> getAllUsers();

    Resource<UserDTO> getUserById(Long id);

    Resource<UserDTO> getUserByUsername(String username);

    Resource<UserDTO> createNewUser(UserDTO userDTO);

    Resource<UserDTO> updateUser(Long id, UserDTO userDTO);

    Resource<UserDTO> patchUser(Long id, UserDTO userDTO);

    void deleteUserById(Long id);

    Resource<ShoppingCartDTO> createNewShoppingCart(Long id, ShoppingCartDTO shoppingCartDTO);

    Resource<ProductDTO> createNewProduct(Long id, ProductDTO productDTO);

    Resources<Resource<ProductDTO>> getAllProducts(Long id);

    Resource<ShoppingCartDTO> getShoppingCart(Long id);

}
