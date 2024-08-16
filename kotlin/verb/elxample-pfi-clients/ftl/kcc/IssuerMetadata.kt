package ftl.kcc

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="IssuerMetadata",
  module="kcc",
)
public data class IssuerMetadata(
  public val credentialIssuer: String,
  public val credentialEndpoint: String,
  public val credentialConfigurationSupported: CredentialConfigurationSupported,
)
