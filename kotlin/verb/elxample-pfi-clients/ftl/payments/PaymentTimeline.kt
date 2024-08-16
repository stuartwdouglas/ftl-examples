package ftl.payments

import java.time.ZonedDateTime
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="PaymentTimeline",
  module="payments",
)
public data class PaymentTimeline(
  public val authorizedAt: ZonedDateTime,
  public val capturedAt: ZonedDateTime,
)
