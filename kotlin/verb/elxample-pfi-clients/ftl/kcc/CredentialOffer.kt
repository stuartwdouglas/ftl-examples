package ftl.kcc

import kotlin.String
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CredentialOffer",
  module="kcc",
)
public data class CredentialOffer(
  public val credentialIssuerUrl: String,
  public val credentialConfigurationId: List<String>,
  public val grants: Grants,
)
