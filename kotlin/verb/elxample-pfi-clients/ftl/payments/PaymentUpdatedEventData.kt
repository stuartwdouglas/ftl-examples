package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="PaymentUpdatedEventData",
  module="payments",
)
public data class PaymentUpdatedEventData(
  public val type: String,
  public val id: String,
  public val `object`: PaymentUpdatedEventObject,
)
