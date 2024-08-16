package ftl.adminbff

import ftl.payments.CustomerBalances
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="AdminGetCustomerBalancesResponse",
  module="adminbff",
)
public data class AdminGetCustomerBalancesResponse(
  public val allCustomerBalances: List<CustomerBalances>,
)
