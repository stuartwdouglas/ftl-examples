package ftl.payments

import kotlin.Long
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Money",
  module="payments",
)
public data class Money(
  public val amount: Long,
  public val currency: String,
)
