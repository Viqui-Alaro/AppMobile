package mobile.sin.gob.bo.mobiledao.repositoryImpl;
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
//asdhfkja
    @Override
    public Comparable insertOrUpdate(final usuario usuario) {

        Completable var1= Completable.fromAction(new Action() {
            @Override
            public void run() throws Exception {

            usuarioRepositoryImpl.this.usuarioDao.insertOrUpdate(usuarioRepositoryImpl.this.mapper.toEntity(usuario));
         }
        });


        return null;
    }

    /*
      Intrinsics.checkExpressionValueIsNotNull(var10000, "Completable.fromAction {…(mapper.toEntity(note)) }");
      return var10000;
     */

    @Override
    public Comparable delete(usuario usuario) {
        return null;
    }
}








/*
   @NotNull
   public Completable insertOrUpdate(@NotNull final Note note) {
      Intrinsics.checkParameterIsNotNull(note, "note");
      Completable var10000 = Completable.fromAction((Action)(new Action() {
         public final void run() {
            NoteRepositoryImpl.this.noteDao.insertOrUpdate(NoteRepositoryImpl.this.mapper.toEntity(note));
         }
      }));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "Completable.fromAction {…(mapper.toEntity(note)) }");
      return var10000;
   }
 */
















/*

public final class NoteRepositoryImpl implements NoteRepository {
   private final NoteDaoImpl noteDao;
   private final NoteModelMapperImpl mapper;

   @NotNull
   public Completable insertOrUpdate(@NotNull final Note note) {
      Intrinsics.checkParameterIsNotNull(note, "note");
      Completable var10000 = Completable.fromAction((Action)(new Action() {
         public final void run() {
            NoteRepositoryImpl.this.noteDao.insertOrUpdate(NoteRepositoryImpl.this.mapper.toEntity(note));
         }
      }));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "Completable.fromAction {…(mapper.toEntity(note)) }");
      return var10000;
   }

   @NotNull
   public Completable delete(@NotNull final Note note) {
      Intrinsics.checkParameterIsNotNull(note, "note");
      Completable var10000 = Completable.fromAction((Action)(new Action() {
         public final void run() {
            NoteRepositoryImpl.this.noteDao.delete(NoteRepositoryImpl.this.mapper.toEntity(note));
         }
      }));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "Completable.fromAction {…(mapper.toEntity(note)) }");
      return var10000;
   }

   @NotNull
   public Maybe findNoteById(long id) {
      Maybe var10000 = this.noteDao.findNoteById(id).map((Function)(new Function() {
         // $FF: synthetic method
         // $FF: bridge method
         public Object apply(Object var1) {
            return this.apply((NoteEntity)var1);
         }

         @NotNull
         public final Note apply(@NotNull NoteEntity it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            return NoteRepositoryImpl.this.mapper.fromEntity(it);
         }
      }));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "noteDao.findNoteById(id)…{ mapper.fromEntity(it) }");
      return var10000;
   }

   @NotNull
   public Single getAllNotes() {
      Single var10000 = this.noteDao.getAllNotes().map((Function)(new Function() {
         // $FF: synthetic method
         // $FF: bridge method
         public Object apply(Object var1) {
            return this.apply((List)var1);
         }

         @NotNull
         public final List apply(@NotNull List it) {
            Intrinsics.checkParameterIsNotNull(it, "it");
            Iterable $receiver$iv = (Iterable)it;
            NoteModelMapperImpl var3 = NoteRepositoryImpl.this.mapper;
            Collection destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($receiver$iv, 10)));
            Iterator var6 = $receiver$iv.iterator();

            while(var6.hasNext()) {
               Object item$iv$iv = var6.next();
               NoteEntity p1 = (NoteEntity)item$iv$iv;
               Note var13 = var3.fromEntity(p1);
               destination$iv$iv.add(var13);
            }

            return (List)destination$iv$iv;
         }
      }));
      Intrinsics.checkExpressionValueIsNotNull(var10000, "noteDao.getAllNotes()\n  …map(mapper::fromEntity) }");
      return var10000;
   }

   public NoteRepositoryImpl(@NotNull NoteDaoImpl noteDao, @NotNull NoteModelMapperImpl mapper) {
      Intrinsics.checkParameterIsNotNull(noteDao, "noteDao");
      Intrinsics.checkParameterIsNotNull(mapper, "mapper");
      super();
      this.noteDao = noteDao;
      this.mapper = mapper;
   }
 */