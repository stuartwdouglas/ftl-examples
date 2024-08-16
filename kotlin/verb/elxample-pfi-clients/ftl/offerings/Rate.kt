package ftl.offerings

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Rate",
  module="offerings",
)
public data class Rate(
  public val payinAmount: String,
  public val payoutAmount: String,
  public val payinFee: String,
  public val payoutFee: String,
  public val payinCurrency: String,
  public val payoutCurrency: String,
  public val midmarketRateToken: String,
  public val payoutUnitsPerPayinUnit: String,
)
