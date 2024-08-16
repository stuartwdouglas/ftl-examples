package ftl.tbdex

import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Message",
  module="tbdex",
)
public data class Message(
  public val metadata: Map<String, Any>,
  public val `data`: Map<String, Any>,
  public val signature: String,
)
