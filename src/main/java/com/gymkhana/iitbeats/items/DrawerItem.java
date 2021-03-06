package com.gymkhana.iitbeats.items;

import java.io.Serializable;

/**
 * Created by BijoySingh on 9/11/2015.
 */
public class DrawerItem implements Serializable {
    public Integer tag, logo;
    public String title;
    public DrawerItem(Integer tag, String title, Integer logo) {
        this.tag = tag;
        this.title = title;
        this.logo = logo;
    }

    public static final class Tags {
        public static final Integer MENU = 0;
        public static final Integer SHOPS = 1;
        public static final Integer ORDERS = 2;
        public static final Integer BILLS = 3;
        public static final Integer LOGOUT = 4;
        public static final Integer LOGIN = 5;
        public static final Integer CATEGORIES = 6;
        public static final Integer ORDER_ITEM = 7;
        public static final Integer CART = 8;
    }
}
