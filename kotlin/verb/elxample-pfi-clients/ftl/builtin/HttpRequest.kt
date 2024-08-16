package ftl.builtin

import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="HttpRequest",
  module="builtin",
)
public data class HttpRequest<Body>(
  public val method: String,
  public val path: String,
  public val pathParameters: Map<String, String>,
  public val query: Map<String, List<String>>,
  public val headers: Map<String, List<String>>,
  public val body: Body,
)
