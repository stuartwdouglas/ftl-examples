package ftl.customers

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getInstitutionalCustomer",
  module="customers",
)
public interface GetInstitutionalCustomerClient :
    VerbClient<GetInstitutionalCustomerRequest, ApiInstitutionalCustomer> {
  public override fun call(`value`: GetInstitutionalCustomerRequest): ApiInstitutionalCustomer
}
