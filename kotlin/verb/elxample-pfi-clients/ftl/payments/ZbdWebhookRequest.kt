package ftl.payments

import java.time.ZonedDateTime
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="ZbdWebhookRequest",
  module="payments",
)
public data class ZbdWebhookRequest(
  public val amount: String,
  public val confirmedAt: ZonedDateTime,
  public val description: String,
  public val fee: String,
  public val id: String,
  public val paymentToken: String,
  public val invoice: String,
  public val preimage: String,
  public val processedAt: ZonedDateTime,
  public val status: String,
  public val unit: String,
)
