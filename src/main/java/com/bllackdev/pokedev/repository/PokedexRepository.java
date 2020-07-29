package com.bllackdev.pokedev.repository;

import com.bllackdev.pokedev.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository <Pokemon, String> {
}
