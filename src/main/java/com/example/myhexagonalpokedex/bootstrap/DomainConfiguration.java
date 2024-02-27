package com.example.myhexagonalpokedex.bootstrap;

import com.example.myhexagonalpokedex.domain.pokemon.CapturablePokemonUseCase;
import com.example.myhexagonalpokedex.domain.pokemon.PokemonApiFetcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfiguration {

    @Bean
    public CapturablePokemonUseCase capturablePokemonService(PokemonApiFetcher pokemonApiFetcher) {
        return new CapturablePokemonUseCase(pokemonApiFetcher);
    }
}
