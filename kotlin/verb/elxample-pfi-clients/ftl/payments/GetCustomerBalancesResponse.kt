package ftl.payments

import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="GetCustomerBalancesResponse",
  module="payments",
)
public data class GetCustomerBalancesResponse(
  public val balances: List<CustomerBalance>,
)
