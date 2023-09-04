package com.workitech.s19g1.dto;

import com.workitech.s19g1.entity.Movie;
import com.workitech.s19g1.service.MovieService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieActorResponse {

    private Movie movie;
    private int actorId;
    private String actorFirstName;
    private String getActorLastName;
    private LocalDate actorBirthDate;

}
