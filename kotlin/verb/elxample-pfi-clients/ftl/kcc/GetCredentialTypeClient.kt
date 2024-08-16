package ftl.kcc

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getCredentialType",
  module="kcc",
)
public interface GetCredentialTypeClient :
    VerbClient<GetCredentialTypeRequest, GetCredentialTypeResponse> {
  public override fun call(`value`: GetCredentialTypeRequest): GetCredentialTypeResponse
}
