import androidx.lifecycle.ViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;

public class AccountViewModel extends ViewModel {

    private final AccountModel accountModel;

    public AccountViewModel() {
        accountModel = new AccountModel();
    }

    public void createAccount(String email, String password, OnCompleteListener<AuthResult> onCompleteListener) {
        accountModel.createAccount(email, password, onCompleteListener);
    }
}
