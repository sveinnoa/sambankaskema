package is.netbokhald.li;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.ws.security.WSPasswordCallback;

public class ClientPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException, 
        UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {

        	WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

        	if (pc.getUsage() == WSPasswordCallback.USERNAME_TOKEN) {
        		// set the password for our message.
        		pc.setIdentifier("L5801740439B2B");
        		pc.setPassword("L5820425");
        	}
        }
    }

}