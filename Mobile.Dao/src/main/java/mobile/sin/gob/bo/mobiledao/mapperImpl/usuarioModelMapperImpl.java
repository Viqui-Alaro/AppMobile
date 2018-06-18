package mobile.sin.gob.bo.mobiledao.mapperImpl;

import mobile.sin.gob.bo.mobiledao.entities.usuarioEntity;
import mobile.sin.gob.bo.mobiledomain.model.usuario;
import mobile.sin.gob.bo.mobiledomain.repository.usuarioModelMapper;

public class usuarioModelMapperImpl implements usuarioModelMapper {

    @Override
    public usuario fromEntity(Object from) {
        return new usuario(from.getClass().getName());
    }

    @Override
    public usuarioEntity toEntity(Object from) {
        return new usuarioEntity(from.getClass().getName());
    }

}


