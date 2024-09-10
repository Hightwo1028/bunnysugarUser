package com.example.bunnysugar.service;

import com.example.bunnysugar.model.WishList;
import com.example.bunnysugar.repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;

    public WishList createWishList(WishList wishList) {
        return wishListRepository.save(wishList);
    }

    public WishList getWishListById(Long id) {
        return wishListRepository.findById(id).orElse(null);
    }

    public WishList updateWishList(Long id, WishList wishList) {
        if (wishListRepository.existsById(id)) {
            wishList.setId(id);
            return wishListRepository.save(wishList);
        }
        return null;
    }

    public void deleteWishList(Long id) {
        wishListRepository.deleteById(id);
    }

    public List<WishList> getAllWishLists() {
        return wishListRepository.findAll();
    }
}
