package io.github.olivierlemasle.ca;

import java.io.File;
import java.security.KeyStore;
import java.security.PrivateKey;

public interface CertificateWithPrivateKey extends Certificate {

    public KeyStore addToKeystore(KeyStore keyStore, char[] keystorePassword, String alias);

    public KeyStore saveInPkcs12Keystore(char[] keystorePassword, String alias);

    public void exportPkcs12(final String keystorePath, final char[] keystorePassword,
                             final String alias);

    public void exportPkcs12(final File keystoreFile, final char[] keystorePassword,
                             final String alias);

    public PrivateKey getPrivateKey();

    public String printKey();

    public void saveKey(File file);

    public void saveKey(String fileName);
}
