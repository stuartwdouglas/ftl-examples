package ftl.types

import kotlin.Long
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Error",
  module="types",
)
public data class Error(
  public val message: String,
  public val code: Long,
  public val `field`: String,
)
