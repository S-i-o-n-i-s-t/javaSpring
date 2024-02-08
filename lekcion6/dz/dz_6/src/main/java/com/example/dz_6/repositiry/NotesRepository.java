package com.example.dz_6.repositiry;

import com.example.dz_6.domen.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {
    Optional<Notes> findById(Long id);
    List<Notes> findByTitleContainingIgnoreCase(String keywordTitle);
    List<Notes> findNotesByContentContainingIgnoreCase(String keywordContent);
    List<Notes> findByTitleContainingIgnoreCaseAndContentContainingIgnoreCase(
            String keywordTitle, String keywordContent);

}
