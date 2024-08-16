package ftl.customers

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="createInstitutionalCustomer",
  module="customers",
)
public interface CreateInstitutionalCustomerClient :
    VerbClient<CreateInstitutionalCustomerRequest, ApiInstitutionalCustomer> {
  public override fun call(`value`: CreateInstitutionalCustomerRequest): ApiInstitutionalCustomer
}
