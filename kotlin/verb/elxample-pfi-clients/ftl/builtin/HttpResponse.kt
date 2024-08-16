package ftl.builtin

import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="HttpResponse",
  module="builtin",
)
public data class HttpResponse<Body, Error>(
  public val status: Long,
  public val headers: Map<String, List<String>>,
  public val body: Body,
  public val error: Error,
)
