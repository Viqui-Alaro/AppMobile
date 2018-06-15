package mobile.sin.gob.bo.mobiledao.mapperImpl;

import mobile.sin.gob.bo.mobiledao.entities.usuarioEntity;
import mobile.sin.gob.bo.mobiledomain.model.usuario;
import mobile.sin.gob.bo.mobiledomain.repository.usuarioModelMapper;

public class usuarioModelMapperImpl implements usuarioModelMapper {

    @Override
    public usuario fromEntity(Object var1) {
        return new usuario(var1.getClass().getName());
    }

    @Override
    public usuarioEntity toEntity(Object var1) {
        return new usuarioEntity(fromEntity(var1).getNombre());
    }
}

