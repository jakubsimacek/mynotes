/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.simacek.mynotes.domain;

import java.util.Date;

/**
 *
 * @author Jakub
 */
public class NoteHeader {
    Long id;
    String title;
    NoteDetail noteDetail;
    Date created;
    Date modified;
}