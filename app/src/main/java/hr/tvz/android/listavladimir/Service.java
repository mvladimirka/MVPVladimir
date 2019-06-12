package hr.tvz.android.listavladimir;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("https://github.com/mvladimirka/MVPVladimir/blob/master/app/src/main/res/raw/lista.json")
    Call<List<ModelClass>> getmodelClassList();
}
