package ftl.payments

import java.time.ZonedDateTime
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Payment",
  module="payments",
)
public data class Payment(
  public val id: String,
  public val createdAt: ZonedDateTime,
  public val updatedAt: ZonedDateTime,
  public val amountMoney: Money,
  public val status: PaymentStatus,
  public val delayDuration: String,
  public val sourceType: String,
  public val locationId: String,
  public val orderId: String,
  public val totalMoney: Money,
  public val cardDetails: CardPaymentDetails,
  public val capabilities: List<String>,
  public val approvedMoney: Money,
  public val riskEvaluation: RiskEvaluation,
  public val receiptNumber: String,
  public val receiptUrl: String,
  public val delayAction: String,
  public val delayedUntil: ZonedDateTime,
  public val versionToken: String,
  public val applicationDetails: ApplicationDetails,
  public val billingAddress: BillingAddress,
  public val customerId: String,
  public val processingFee: List<ProcessingFee>,
  public val tipMoney: Money,
  public val version: Long,
)
