package com.waytoodanny.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "songs")
public interface SongRepository extends CrudRepository<Song, Long> {
}
