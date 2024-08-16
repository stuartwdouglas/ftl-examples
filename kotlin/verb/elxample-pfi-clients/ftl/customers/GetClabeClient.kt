package ftl.customers

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getClabe",
  module="customers",
)
public interface GetClabeClient : VerbClient<GetClabeRequest, GetClabeResponse> {
  public override fun call(`value`: GetClabeRequest): GetClabeResponse
}
