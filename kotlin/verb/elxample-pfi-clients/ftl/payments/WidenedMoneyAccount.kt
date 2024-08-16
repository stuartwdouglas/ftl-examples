package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="WidenedMoneyAccount",
  module="payments",
)
public data class WidenedMoneyAccount(
  public val token: String,
  public val currency: Currency,
  public val custodian: String,
)
