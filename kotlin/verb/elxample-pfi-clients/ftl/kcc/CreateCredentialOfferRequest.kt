package ftl.kcc

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CreateCredentialOfferRequest",
  module="kcc",
)
public data class CreateCredentialOfferRequest(
  public val credentialTypeToken: String,
  public val applicantDid: String,
)
