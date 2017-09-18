package unikl.hunnygenius.debug;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import io.sentry.Sentry;
import io.sentry.android.AndroidSentryClientFactory;

public class sentry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentry);

        Context ctx = this.getApplicationContext();
        // Use the Sentry DSN (client key) from the Project Settings page on Sentry
        String sentryDsn = "https://4ef56cabf7da4563ba06997ac2818cd5:8583106282bb4a6397272ee5fa50c8ba@sentry.io/208165";
        Sentry.init(sentryDsn, new AndroidSentryClientFactory(ctx));

        Sentry.capture("This is a test");
        try {
            unsafeMethod();
        } catch (Exception e) {
            // This sends an exception event to Sentry using the statically stored instance
            // that was created in the ``main`` method.
            Sentry.capture(e);
        }
    }

    void unsafeMethod(){
        throw new UnsupportedOperationException("You shouldn't call this!");
    }
    }

