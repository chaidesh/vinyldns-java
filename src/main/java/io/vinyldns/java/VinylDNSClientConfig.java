/**
 * Copyright 2018 Comcast Cable Communications Management, LLC
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vinyldns.java;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;

public class VinylDNSClientConfig {
  private String baseUrl;

  private AWSCredentials credentials;

  private Signer signer;

  public VinylDNSClientConfig(String baseUrl, AWSCredentials credentials, Signer signer) {
    this.baseUrl = baseUrl;
    this.credentials = credentials;
    this.signer = signer;
  }

  public VinylDNSClientConfig(String baseUrl, AWSCredentials credentials) {
    this(baseUrl, credentials, SignerFactory.getSigner("VinylDNS", "us/east"));
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public AWSCredentials getCredentials() {
    return credentials;
  }

  public Signer getSigner() {
    return signer;
  }
}
