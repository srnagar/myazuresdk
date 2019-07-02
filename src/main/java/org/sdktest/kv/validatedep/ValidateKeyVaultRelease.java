package org.sdktest.kv.validatedep;

import com.azure.identity.credential.DefaultAzureCredential;
import com.azure.security.keyvault.keys.KeyClient;
import com.azure.security.keyvault.keys.models.KeyBase;

public class ValidateKeyVaultRelease {

  public static void main(String args[]) {
    KeyClient kc = KeyClient.builder()
        .endpoint("https://srikantakv.vault.azure.net")
        .credential(new DefaultAzureCredential())
        .build();

    Iterable<KeyBase> keys = kc.listKeys();
    keys.forEach(keybase -> System.out.println(keybase.name()));
  }

}
