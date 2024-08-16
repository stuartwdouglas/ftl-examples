package ftl.payments

import kotlin.Any
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getCustomerBalances",
  module="payments",
)
public interface GetCustomerBalancesClient : VerbClient<Any, GetCustomerBalancesResponse> {
  public override fun call(`value`: Any): GetCustomerBalancesResponse
}
