package ftl.builtin

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CatchRequest",
  module="builtin",
)
public data class CatchRequest<Req>(
  public val request: Req,
  public val error: String,
)
