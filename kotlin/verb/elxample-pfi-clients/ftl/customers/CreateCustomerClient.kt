package ftl.customers

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="createCustomer",
  module="customers",
)
public interface CreateCustomerClient : VerbClient<CreateCustomerRequest, GetCustomerResponse> {
  public override fun call(`value`: CreateCustomerRequest): GetCustomerResponse
}
