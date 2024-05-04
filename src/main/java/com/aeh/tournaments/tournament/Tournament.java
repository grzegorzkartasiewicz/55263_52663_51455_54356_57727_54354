package com.aeh.tournaments.tournament;

import com.aeh.tournaments.competitors.Competitor;
import com.aeh.tournaments.duel.Duel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="Tournament")
@Getter
@Setter
class Tournament {

    @Id
    @GeneratedValue()
    private long id;
    @OneToMany
    private Set<Duel> duels;
    private int numberOfCompetitors;
    @ManyToOne
    private Competitor winner;
}