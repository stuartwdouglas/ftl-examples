package ftl.payments

import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="WidenedPendingPayoutParams",
  module="payments",
)
public data class WidenedPendingPayoutParams(
  public val amount: String,
  public val recipient: Map<String, Any>,
)
