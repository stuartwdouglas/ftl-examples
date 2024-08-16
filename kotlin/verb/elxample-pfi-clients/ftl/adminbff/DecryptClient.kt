package ftl.adminbff

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="decrypt",
  module="adminbff",
)
public interface DecryptClient : VerbClient<DecryptRequest, DecryptResponse> {
  public override fun call(`value`: DecryptRequest): DecryptResponse
}
