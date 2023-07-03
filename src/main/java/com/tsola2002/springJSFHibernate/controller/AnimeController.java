package com.tsola2002.springJSFHibernate.controller;

import com.tsola2002.springJSFHibernate.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AnimeController {

  @Autowired
  AnimeService animeService;

  @GetMapping({"/", "/viewAnimeList"})
  public String viewAnimeList(Model model, @ModelAttribute("message") String message) {
    model.addAttribute("animeList", animeService.getAllAnime());
    model.addAttribute("message", message);

    return "ViewAnimeList";
  }

}
