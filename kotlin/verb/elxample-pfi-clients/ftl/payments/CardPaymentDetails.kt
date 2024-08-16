package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CardPaymentDetails",
  module="payments",
)
public data class CardPaymentDetails(
  public val authResultCode: String,
  public val avsStatus: String,
  public val card: Card,
  public val cardPaymentTimeline: PaymentTimeline,
  public val cvvStatus: String,
  public val entryMethod: String,
  public val statementDescription: String,
  public val status: String,
)
