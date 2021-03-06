package com.hiki.album.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：hiki
 * 2019/8/16 9:45
 */
@Controller
@RequestMapping("/admin")
public class AdminViewController {
    @GetMapping("/albumedit")
    public String albumedit(){
        return "album_edit";
    }

    @GetMapping("/upload")
    public String index(){
        return "upload_photo";
    }

    @GetMapping("/albumcategoryedit")
    public String albumcategoryedit(){
        return "album_category_edit";
    }

    @GetMapping("/photosmanagement")
    public String photosmanagement(){
        return "photo_management";
    }

    @GetMapping("/albumcategorymanagement")
    public String albumcategorymanagement(){
        return "album_category_management";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/authupdatepassword")
    public String authupdatepassword(){
        return "auth_update_password";
    }

    @GetMapping("/authmanagement")
    public String authmanagement(){
        return "auth_management";
    }

    @GetMapping("/management")
    public String management(){
        return "management";
    }

    @GetMapping("/albummanagement")
    public String albummanagement(){
        return "album_management";
    }
}
