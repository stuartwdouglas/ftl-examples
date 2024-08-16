package ftl.payments

import kotlin.Boolean
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="BankayaWebhookRequest",
  module="payments",
)
public data class BankayaWebhookRequest(
  public val transferId: Boolean,
  public val transferType: String,
  public val confirmationNumber: String,
  public val externalId: String,
  public val operationStatus: OperationStatus,
  public val resultDatetime: String,
  public val stamp: String,
  public val applyDatetime: String,
)
