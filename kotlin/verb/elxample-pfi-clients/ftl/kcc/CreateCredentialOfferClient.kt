package ftl.kcc

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="createCredentialOffer",
  module="kcc",
)
public interface CreateCredentialOfferClient :
    VerbClient<CreateCredentialOfferRequest, CreateCredentialOfferResponse> {
  public override fun call(`value`: CreateCredentialOfferRequest): CreateCredentialOfferResponse
}
