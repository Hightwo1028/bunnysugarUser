package com.example.bunnysugar.model;

import java.time.LocalDateTime;

public class WishList {
    private int id;
    private int userId;
    private int cartId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "WishList{" +
                "id=" + id +
                ", userId=" + userId +
                ", cartId=" + cartId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

