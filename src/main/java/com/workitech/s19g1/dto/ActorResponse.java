package com.workitech.s19g1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorResponse {
private int id;
private String actorFirstName;
private String getActorLastName;
private LocalDate actorBirthDate;


}