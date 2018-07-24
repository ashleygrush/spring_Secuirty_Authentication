package com.javasampleapproach.springsecurity.jdbcauthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Random;

@Controller
public class WebController {

    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/user")
    public String user() {
        return "user";
    }

    @RequestMapping(value = "/admin")

    // add Model to set date and time (admin only)
    public String admin(Model model) {
        model.addAttribute("date", DateAndTime());
        model.addAttribute("quote", quoteShuffle(quotes));
        return "admin";
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/403")
    public String Error403() {
        return "403";
    }

    // model for date and current time
    public Object DateAndTime() {
        Date date = new Date();
        return date;
    }

    // shuffles quote of the day
    public Object quoteShuffle(String[] quotes) {
        Random random = new Random();
        int max = 11;
        int min = 0;

        return random.nextInt((max - min) + 1) + min;
    }

    // array of quotes to choose from for QOTD.
    public String quotes[] = {
            "Be yourself; everyone else is already taken.― Oscar Wilde",
            "A room without books is like a body without a soul. ― Marcus Tullius Cicero",
            "Be the change that you wish to see in the world. ― Mahatma Gandhi",
            "If you tell the truth, you don't have to remember anything. ― Mark Twain",
            "If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.― J.K. Rowling",
            "To live is the rarest thing in the world. Most people exist, that is all.― Oscar Wilde",
            "Without music, life would be a mistake. ― Friedrich Nietzsche",
            "Always forgive your enemies, nothing annoys them so much. ― Oscar Wilde",
            "Life isn't about getting and having, it's about giving and being. –Kevin Kruse",
            "Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill",
            "Strive not to be a success, but rather to be of value. –Albert Einstein",
    };

}
