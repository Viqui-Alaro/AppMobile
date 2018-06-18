package mobile.sin.gob.bo.mobiledomain.repository;

import mobile.sin.gob.bo.mobiledomain.model.Login;
import mobile.sin.gob.bo.mobiledomain.model.usuario;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface userClient {
    @POST("login")
    Call<usuario> login(@Body Login login);

    @GET("secretinfo")
    Call<ResponseBody> getSecret(@Header("Authorization")String authToken);
}
