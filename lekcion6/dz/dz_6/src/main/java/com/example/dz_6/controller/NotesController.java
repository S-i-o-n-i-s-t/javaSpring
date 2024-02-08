package com.example.dz_6.controller;

import com.example.dz_6.domen.Notes;
import com.example.dz_6.repositiry.NotesRepository;
import com.example.dz_6.services.NotesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//		Все методы контроллера возвращают ResponseEntity(как на семинаре)
//		1. Добавление заметки. (Подсказка @PostMapping )
//		2. Просмотр всех заметок.(Подсказка @GetMapping )
//		3. Получение заметки по id. (Подсказка @GetMapping("/{id}") )
//		4. Редактирование заметки.(Подсказка @PutMapping("/{id}") )
//		5. Удаление заметки.(Подсказка @DeleteMapping("/{id}") )
@RestController
@RequestMapping("/notes")
@RequiredArgsConstructor
public class NotesController {
    // addNote
    // getAllNotes
    // getByIdNotes
    // updateNote
    // deleteNote
    private NotesServices notesServices;
    @GetMapping
    public ResponseEntity<List<Notes>> getAllNotes(){
        return ResponseEntity.ok(notesServices.getAllNotes());
    }
    @GetMapping("/id")
    public ResponseEntity<Notes> getNoteById(@PathVariable Long id){
        return ResponseEntity.ok(notesServices.getNoteById(id));
    }
    @GetMapping("/search")
    public ResponseEntity<List<Notes>> searchNotes(@RequestParam(required = false) String keywordContent,
                                                   @RequestParam(required = false) String keywordTitle){
        if (keywordContent != null && keywordTitle != null){
            return ResponseEntity.ok(notesServices.getNotesByTitleAndContentContaining(keywordTitle, keywordContent));
        } else if (keywordContent != null) {
            return ResponseEntity.ok(notesServices.getNotesByContentContaining(keywordContent));
        } else if (keywordTitle != null) {
            return ResponseEntity.ok(notesServices.getNotesByTitleContaining(keywordTitle));
        }else {
            return ResponseEntity.ok(notesServices.getAllNotes());
        }
    }
    @PostMapping
    public ResponseEntity<Notes> createNote(@RequestBody Notes notes){
        return ResponseEntity.ok(notesServices.createNote(notes));
    }
    @PutMapping
    public ResponseEntity<Notes> updateNote(@RequestBody Notes notes){
        return ResponseEntity.ok(notesServices.updateNote(notes));
    }
    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteNote(@PathVariable Long id){
        notesServices.delteNote(id);
        return ResponseEntity.ok().build();
    }
}

















