package mx.linkom.caseta_sanmb;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "TOKEN";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        mx.linkom.caseta_sanmb.Global.TOKEN = FirebaseInstanceId.getInstance().getToken();
    }

}