package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="WidenedPendingPayinParams",
  module="payments",
)
public data class WidenedPendingPayinParams(
  public val customer: String,
  public val amount: String,
  public val fee: String,
)
