package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="BillingAddress",
  module="payments",
)
public data class BillingAddress(
  public val addressLine1: String,
  public val addressLine2: String,
  public val country: String,
  public val firstName: String,
  public val lastName: String,
  public val locality: String,
  public val postalCode: String,
)
