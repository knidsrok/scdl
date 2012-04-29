package net.rdrei.android.scdl.guice;

import java.security.cert.CertificateException;

import net.rdrei.android.scdl.Config;

import org.thoughtcrime.ssl.pinning.PinningTrustManager;
import org.thoughtcrime.ssl.pinning.PinningTrustManagerImpl;

import com.google.inject.Provider;

public class PinningTrustManagerProvider implements
		Provider<PinningTrustManager> {

	@Override
	public PinningTrustManager get() {
		try {
			return new PinningTrustManagerImpl(
					new String[] { Config.API_SSL_PIN_HASH });
		} catch (CertificateException e) {
			throw new IllegalStateException(e);
		}
	}

}