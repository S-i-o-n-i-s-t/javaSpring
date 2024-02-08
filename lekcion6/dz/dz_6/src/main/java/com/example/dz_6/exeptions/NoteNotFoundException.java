package com.example.dz_6.exeptions;

public class NoteNotFoundException extends RuntimeException{
    public  NoteNotFoundException(String message){
        super(message);
    }
}
