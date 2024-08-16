package ftl.customers

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getCustomerByDid",
  module="customers",
)
public interface GetCustomerByDidClient : VerbClient<GetCustomerByDidRequest, GetCustomerResponse> {
  public override fun call(`value`: GetCustomerByDidRequest): GetCustomerResponse
}
