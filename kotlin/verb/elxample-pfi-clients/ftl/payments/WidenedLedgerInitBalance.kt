package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="WidenedLedgerInitBalance",
  module="payments",
)
public data class WidenedLedgerInitBalance(
  public val moneyAccount: WidenedMoneyAccount,
  public val balance: String,
)
