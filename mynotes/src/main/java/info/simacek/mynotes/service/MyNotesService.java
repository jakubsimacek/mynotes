/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.mynotes.service;

import info.simacek.mynotes.domain.Folder;
import info.simacek.mynotes.domain.NoteDetail;
import java.util.List;

/**
 *
 * @author Jakub
 */
public interface MyNotesService {
    
    void createNote(Folder folder, NoteDetail note);
    void updateNote(NoteDetail note);
    void deleteNote(NoteDetail note);
    List<NoteDetail> getAllFolderNotes(Folder folder);
    List<NoteDetail> findNotes(String regex);
    List<NoteDetail> findNotes(Folder searchFolder, String regex, boolean findRecursively);
    
    void createFolder(Folder parentFolder, Folder folder);
    void deleteFolder(Folder folder, boolean deleteNonempty);
    void getAllSubfolders(Folder parentFolder);
    void moveFolder(Folder folder, Folder newParentFolder);
   
}
