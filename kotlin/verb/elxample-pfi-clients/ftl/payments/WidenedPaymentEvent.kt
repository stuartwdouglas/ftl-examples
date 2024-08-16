package ftl.payments

import kotlin.Long
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="WidenedPaymentEvent",
  module="payments",
)
public data class WidenedPaymentEvent(
  public val transactionToken: String,
  public val paymentToken: String,
  public val type: String,
  public val retryCount: Long,
)
