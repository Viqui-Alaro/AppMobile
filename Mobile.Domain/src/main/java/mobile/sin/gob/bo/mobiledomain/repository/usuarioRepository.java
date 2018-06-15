package mobile.sin.gob.bo.mobiledomain.repository;

import mobile.sin.gob.bo.mobiledomain.model.usuario;

/**
 * Interfaz de repositorio para ser implementado por la capa de Datos.
 */

public interface usuarioRepository {

    Comparable insertOrUpdate(usuario usuario);
    Comparable delete(usuario usuario);

}


















/*
public interface NoteRepository {
   @NotNull
   Completable insertOrUpdate(@NotNull Note var1);

   @NotNull
   Completable delete(@NotNull Note var1);

   @NotNull
   Maybe findNoteById(long var1);

   @NotNull
   Single getAllNotes();
}

 */