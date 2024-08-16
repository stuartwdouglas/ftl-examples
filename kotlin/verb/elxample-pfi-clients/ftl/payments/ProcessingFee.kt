package ftl.payments

import java.time.ZonedDateTime
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="ProcessingFee",
  module="payments",
)
public data class ProcessingFee(
  public val amountMoney: Money,
  public val effectiveAt: ZonedDateTime,
  public val type: String,
)
