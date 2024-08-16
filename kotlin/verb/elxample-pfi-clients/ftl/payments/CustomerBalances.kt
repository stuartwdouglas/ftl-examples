package ftl.payments

import kotlin.Any
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CustomerBalances",
  module="payments",
)
public data class CustomerBalances(
  public val customer: Any,
  public val balances: List<MoneyAcctBalance>,
)
