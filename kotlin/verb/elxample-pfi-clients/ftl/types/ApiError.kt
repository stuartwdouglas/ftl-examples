package ftl.types

import kotlin.String
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="ApiError",
  module="types",
)
public data class ApiError(
  public val message: String,
  public val errors: List<Error>,
)
