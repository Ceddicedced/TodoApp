package dev.busacker.mytaskapp.data;

import android.os.SystemClock;

import dev.busacker.mytaskapp.data.model.LoggedInUser;

import java.io.IOException;
import java.util.Random;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");

            for (int i = 0; i < 10; i++){
                final int random = new Random().nextInt(1);
            }
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}