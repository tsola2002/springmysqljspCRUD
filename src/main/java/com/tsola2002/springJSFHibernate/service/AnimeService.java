package com.tsola2002.springJSFHibernate.service;

import com.tsola2002.springJSFHibernate.model.Anime;
import com.tsola2002.springJSFHibernate.repo.IAnimeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimeService {

  @Autowired
  IAnimeRepository animeRepo;

  public List<Anime> getAllAnime() {
    List<Anime> animeList = new ArrayList<>();
    animeRepo.findAll()
        .forEach(anime -> animeList.add(anime));

    return animeList;
  }

}
