package is.netbokhald;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

public class Main {
       public static void main(String[] args) {
              
              try {
                     KeyStore keystore;
                     
                     // Get instance of the keystore
//                     keystore = KeyStore.getInstance("Windows-MY", "SunMSCAPI");
//                     keystore = KeyStore.getInstance("PKCS11", "SunPKCS11");
//                     String configName = "/Users/sveinn/pkcs11_java.cfg";
                     String configName = "/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/lib/security/sunpkcs11-macosx.cfg";
                     Provider provider = new sun.security.pkcs11.SunPKCS11(configName);
                     keystore = KeyStore.getInstance("PKCS11", provider);
                     
                     // Loading the keystore
                     keystore.load(null, null);
                     
                     for (Enumeration oEnum = keystore.aliases();oEnum.hasMoreElements();) {                   
                    	 	String sAlias = (String) oEnum.nextElement();
                           X509Certificate oPublicCertificate = (X509Certificate) keystore
                                         .getCertificate(sAlias);                        
                           PrivateKey oPrivateKey = (PrivateKey) keystore.getKey(sAlias,null);
                           // if no keys continue ..
                           if(oPrivateKey == null || sAlias.equals("Auðkenningarskilríki (Sigurpáll Jóhannsson)")) continue;
                           System.out.println("Found a private key with Alias name:"+sAlias);
                           Provider p = keystore.getProvider();
                           // data to signed
                           byte[] data ="this is the just for test".getBytes();
                           // Signing the data
                           Signature sig = Signature.getInstance("SHA1withRSA");
                           sig.initSign(oPrivateKey);
                           
                           sig.update(data);
                           byte[] signature = sig.sign();
                           
                           Signature verifier = Signature.getInstance("SHA1withRSA", p);
                           verifier.initVerify(oPublicCertificate);
                           verifier.update(data);
                           System.out.println("the verification result "+verifier.verify(signature));
                     }
              } catch (KeyStoreException e) {                 
                     e.printStackTrace();
              } catch (NoSuchAlgorithmException e) {                 
                     e.printStackTrace();
              } catch (CertificateException e) {              
                     e.printStackTrace();
              } catch (IOException e) {                
                     e.printStackTrace();
              } catch (UnrecoverableKeyException e) {                
                     e.printStackTrace();
              } catch (InvalidKeyException e) {               
                     e.printStackTrace();
              } catch (SignatureException e) {                
                     e.printStackTrace();
              }             

       }

}

