package ftl.payments

import ftl.builtin.Empty
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getAllCustomerBalances",
  module="payments",
)
public interface GetAllCustomerBalancesClient : VerbClient<Empty, GetAllCustomerBalancesResponse> {
  public override fun call(`value`: Empty): GetAllCustomerBalancesResponse
}
