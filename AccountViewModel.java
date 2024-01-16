import androidx.lifecycle.ViewModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;

public class AccountViewModel extends ViewModel {

    private final AccountModel accountModel;

    public AccountViewModel() {
        accountModel = new AccountModel();
    }

    public void createAccount(String email, String password, OnCompleteListener<AuthResult> onCompleteListener) {
        if(isPasswordValid(password))
        accountModel.createAccount(email, password, onCompleteListener);
        } else {
            // Notify the View or handle the error accordingly
            // For simplicity, let's use a Toast for demonstration purposes
            showToast("Password must contain at least one special character (@), one uppercase letter, and one number.");
        }
    }
      private boolean isPasswordValid(String password) {
        // Implement your password complexity logic here
        // For example, requiring at least one special character, one uppercase letter, and one number
        return password.matches(".*[@#$%^&+=].*") &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*");
    }
     private void showToast(String message) {
        // You can replace this with a proper error handling mechanism in your app
        // For simplicity, using Toast here
        // Note: In a real app, you should use a more user-friendly way to display error messages.
        // For example, a SnackBar or a custom error dialog.
        Toast.makeText(MyApplication.getInstance(), message, Toast.LENGTH_SHORT).show();
    }
}
