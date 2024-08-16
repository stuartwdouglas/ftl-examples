package ftl.payments

import java.time.ZonedDateTime
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="RiskEvaluation",
  module="payments",
)
public data class RiskEvaluation(
  public val createdAt: ZonedDateTime,
  public val riskLevel: String,
)
