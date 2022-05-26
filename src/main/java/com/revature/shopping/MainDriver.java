package com.revature.shopping;

import com.revature.shopping.services.UserService;
import com.revature.shopping.ui.StartMenu;

public class MainDriver {

    public static void main(String[] args) {

        UserService userService = new UserService();



        new StartMenu(userService).start();
    }
}
