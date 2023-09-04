package com.workitech.s19g1.dao;

import com.workitech.s19g1.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
