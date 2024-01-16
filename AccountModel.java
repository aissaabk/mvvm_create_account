public class AccountModel {
    public void createAccount(String email, String password, OnCompleteListener<AuthResult> onCompleteListener) {
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(onCompleteListener);
    }
}
