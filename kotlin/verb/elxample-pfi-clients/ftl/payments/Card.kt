package ftl.payments

import kotlin.Long
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Card",
  module="payments",
)
public data class Card(
  public val bin: String,
  public val cardBrand: String,
  public val cardType: String,
  public val expMonth: Long,
  public val expYear: Long,
  public val fingerprint: String,
  public val last4: String,
  public val paymentAccountReference: String,
  public val prepaidType: String,
)
