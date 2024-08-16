package ftl.payments

import java.time.ZonedDateTime
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="WebhookNotification",
  module="payments",
)
public data class WebhookNotification(
  public val merchantId: String,
  public val type: String,
  public val eventId: String,
  public val createdAt: ZonedDateTime,
  public val `data`: PaymentUpdatedEventData,
)
