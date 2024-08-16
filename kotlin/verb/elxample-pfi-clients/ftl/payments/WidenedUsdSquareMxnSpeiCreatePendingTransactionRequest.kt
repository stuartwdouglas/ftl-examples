package ftl.payments

import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="WidenedUsdSquareMxnSpeiCreatePendingTransactionRequest",
  module="payments",
)
public data class WidenedUsdSquareMxnSpeiCreatePendingTransactionRequest(
  public val payin: WidenedPendingPayinParams,
  public val payout: WidenedPendingPayoutParams,
)
