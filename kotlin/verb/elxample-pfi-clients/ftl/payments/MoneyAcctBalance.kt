package ftl.payments

import kotlin.Any
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="MoneyAcctBalance",
  module="payments",
)
public data class MoneyAcctBalance(
  public val moneyAccount: MoneyAccount,
  public val pending: Any,
  public val settled: Any,
  public val available: Any,
)
