package ftl.payments

import kotlin.Any
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CustomerBalance",
  module="payments",
)
public data class CustomerBalance(
  public val customer: Any,
  public val moneyAccount: MoneyAccount,
  public val pending: Any,
  public val settled: Any,
  public val available: Any,
)
