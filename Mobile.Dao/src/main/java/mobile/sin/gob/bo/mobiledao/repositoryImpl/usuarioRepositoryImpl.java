package mobile.sin.gob.bo.mobiledao.repositoryImpl;
import com.sun.istack.internal.NotNull;

import io.reactivex.Completable;
import io.reactivex.functions.Action;
import mobile.sin.gob.bo.mobiledao.daoImpl.usuarioDaoImpl;
import mobile.sin.gob.bo.mobiledao.mapperImpl.usuarioModelMapperImpl;
import mobile.sin.gob.bo.mobiledomain.model.usuario;
import mobile.sin.gob.bo.mobiledomain.repository.usuarioRepository;


public class usuarioRepositoryImpl implements usuarioRepository{

    private final usuarioDaoImpl usuarioDao;
    private final usuarioModelMapperImpl mapper;

    public usuarioRepositoryImpl(usuarioDaoImpl usuarioDao, usuarioModelMapperImpl mapper) {
        this.usuarioDao = usuarioDao;
        this.mapper = mapper;
    }

    @Override
    public Comparable insertOrUpdate(@NotNull final usuario usuario) {

        Completable var1= Completable.fromAction((Action) new Action() {
            @Override
            public void run(){

            usuarioRepositoryImpl.this.usuarioDao.insertOrUpdate(usuarioRepositoryImpl.this.mapper.toEntity(usuario));
         }
        });

        return (Comparable) var1;
    }

    @Override
    public Comparable delete(@NotNull final usuario usuario) {

        Completable var2 = Completable.fromAction((Action) new Action() {
            @Override
            public void run() {
            usuarioRepositoryImpl.this.usuarioDao.delete(usuarioRepositoryImpl.this.mapper.toEntity(usuario));

            }
        });

        return (Comparable) var2;
    }

}