package mobile.sin.gob.bo.mobiledao.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

/*
 * Descripción: - Clase que implementa el entity Usuario, para el registro de Usuarios
 * @author: viqui.alaro
 * @version:  1.0
 */

@Entity(tableName = "usuarioEntity")
public class usuarioEntity {

  @ColumnInfo(name = "nombre")
  private String nombre;
  @ColumnInfo(name = "login")
  private String login;
  @ColumnInfo(name = "password")
  private String password;
  @ColumnInfo(name = "rol")
  private Boolean rol;

    public usuarioEntity(String nombre) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getRol() {
        return rol;
    }

    public void setRol(Boolean rol) {
        this.rol = rol;
    }
}

