package ftl.kcc

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CreateCredentialOfferResponse",
  module="kcc",
)
public data class CreateCredentialOfferResponse(
  public val token: String,
  public val credentialOffer: CredentialOffer,
)
