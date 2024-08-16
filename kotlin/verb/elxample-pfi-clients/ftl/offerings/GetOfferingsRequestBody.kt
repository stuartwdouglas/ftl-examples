package ftl.offerings

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="GetOfferingsRequestBody",
  module="offerings",
)
public data class GetOfferingsRequestBody(
  public val payinCurrency: String,
  public val payoutCurrency: String,
  public val id: String,
)
