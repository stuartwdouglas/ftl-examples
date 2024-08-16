package ftl.offerings

import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Offering",
  module="offerings",
)
public data class Offering(
  public val metadata: Map<String, Any>,
  public val `data`: Map<String, Any>,
  public val signature: String,
)
