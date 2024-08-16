package ftl.payments

import kotlin.Any
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="MoneyAccount",
  module="payments",
)
public data class MoneyAccount(
  public val token: Any,
  public val currency: Currency,
  public val custodian: String,
)
