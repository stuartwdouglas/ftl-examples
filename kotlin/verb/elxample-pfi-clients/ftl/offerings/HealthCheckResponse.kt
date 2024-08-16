package ftl.offerings

import kotlin.String
import kotlin.collections.Map
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="HealthCheckResponse",
  module="offerings",
)
public data class HealthCheckResponse(
  public val status: String,
  public val details: Map<String, String>,
)
