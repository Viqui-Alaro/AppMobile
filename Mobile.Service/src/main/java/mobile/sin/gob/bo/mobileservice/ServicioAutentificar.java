package mobile.sin.gob.bo.mobileservice;
import mobile.sin.gob.bo.mobiledomain.repository.userClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServicioAutentificar {
    Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl("http://10.1.17.27:39102/token/get/")
            .addConverterFactory(GsonConverterFactory.create());
    Retrofit retrofit = builder.build();
    userClient userClient = retrofit.create(userClient.class);
}
