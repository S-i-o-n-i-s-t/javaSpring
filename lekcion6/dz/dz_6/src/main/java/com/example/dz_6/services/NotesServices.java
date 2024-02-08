package com.example.dz_6.services;

import com.example.dz_6.domen.Notes;
import com.example.dz_6.exeptions.NoteNotFoundException;
import com.example.dz_6.repositiry.NotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class NotesServices{
    private final NotesRepository notesRepository;

    public List<Notes> getAllNotes() {
        return notesRepository.findAll();
    }

    public Notes getNoteById(Long id) {
        return notesRepository.findById(id).
        orElseThrow(() -> new NoteNotFoundException("Note not found by id: " + id));
    }

    public Notes createNote(Notes notes) {
        notes.setCreateDate(LocalDateTime.now());
        return notesRepository.save(notes);
    }

    public Notes updateNote(Notes notes) {
        Notes existingNote = getNoteById(notes.getId());
        existingNote.setTitle(notes.getTitle());
        existingNote.setContent(notes.getContent());
        return notesRepository.save(existingNote);
    }

    public void delteNote(Long id) {
        getNoteById(id);
        notesRepository.deleteById(id);
    }

    public List<Notes> getNotesByTitleContaining(String keyword) {
        List<Notes> notesList = notesRepository.findByTitleContainingIgnoreCase(keyword);
        if (!notesList.isEmpty()){
            return notesList;
        }else throw new NoteNotFoundException("Notes not found with the title: " + keyword);
    }

    public List<Notes> getNotesByContentContaining(String author) {
        List<Notes> notesList = notesRepository.findNotesByContentContainingIgnoreCase( author);
        if (!notesList.isEmpty()){
            return  notesList;
        }else throw new NoteNotFoundException("Notes not found with the content: " + author);
    }

    public List<Notes> getNotesByTitleAndContentContaining(String keywordTitle, String keywordContent) {
        List<Notes> notesList = notesRepository.findByTitleContainingIgnoreCaseAndContentContainingIgnoreCase(
                keywordTitle, keywordContent);
        if (!notesList.isEmpty()){
            return notesList;
        }else throw new NoteNotFoundException("Notes not found with title: " + keywordTitle + " and content: " + keywordContent);
    }
}
