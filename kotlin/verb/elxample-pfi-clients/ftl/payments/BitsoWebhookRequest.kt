package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="BitsoWebhookRequest",
  module="payments",
)
public data class BitsoWebhookRequest(
  public val eventId: String,
  public val status: String,
)
