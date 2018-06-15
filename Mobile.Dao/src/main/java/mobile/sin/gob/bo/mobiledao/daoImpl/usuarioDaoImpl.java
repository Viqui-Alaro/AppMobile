package mobile.sin.gob.bo.mobiledao.daoImpl;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.sun.istack.internal.NotNull;

import mobile.sin.gob.bo.mobiledomain.repository.usuarioDao;

import java.util.List;
import mobile.sin.gob.bo.mobiledao.entities.usuarioEntity;

@Dao
public interface usuarioDaoImpl extends usuarioDao{

    @Insert(onConflict = 1)
    void insertOrUpdate(@NotNull usuarioEntity var1);

    @Query("SELECT * FROM usuarioEntity")
    List<usuarioEntity> getAll();

    @Query("SELECT * FROM usuarioEntity where nombre like :nombre")
    usuarioEntity findByName(String nombre);

    @Query("SELECT COUNT(*) FROM usuarioEntity")
    int count();

    @Delete
    void delete(@NotNull usuarioEntity usuarioEntity);

    @Insert
    void insert(usuarioEntity usuarioEntity);

}











/*
@Dao
public interface NoteDaoImpl extends NoteDao {
   @Insert(
      onConflict = 1
   )
   void insertOrUpdate(@NotNull NoteEntity var1);

   @Delete
   void delete(@NotNull NoteEntity var1);

   @Query("SELECT * FROM notes WHERE id = :id")
   @NotNull
   Maybe findNoteById(long var1);

   @Query("SELECT * FROM notes ORDER BY timestamp DESC")
   @NotNull
   Single getAllNotes();
}
 */

