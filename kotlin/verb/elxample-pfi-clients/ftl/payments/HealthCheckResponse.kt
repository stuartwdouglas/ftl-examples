package ftl.payments

import kotlin.String
import kotlin.collections.Map
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="HealthCheckResponse",
  module="payments",
)
public data class HealthCheckResponse(
  public val status: String,
  public val details: Map<String, String>,
)
