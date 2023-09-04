package com.workitech.s19g1.service;

import com.workitech.s19g1.entity.Actor;

import java.util.List;

public interface ActorService {

    List<Actor> findAll();

    Actor findById(int id);

    Actor save(Actor actor);

    void delete(Actor actor);
}
