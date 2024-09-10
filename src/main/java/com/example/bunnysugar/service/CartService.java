package com.example.bunnysugar.service;

import com.example.bunnysugar.model.Cart;
import com.example.bunnysugar.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart getCartById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    public Cart updateCart(Long id, Cart cart) {
        if (cartRepository.existsById(id)) {
            cart.setId(id);
            return cartRepository.save(cart);
        }
        return null;
    }

    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }
}

