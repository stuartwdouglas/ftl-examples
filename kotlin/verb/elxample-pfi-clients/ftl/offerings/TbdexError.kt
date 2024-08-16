package ftl.offerings

import kotlin.String
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="TbdexError",
  module="offerings",
)
public data class TbdexError(
  public val message: String,
  public val details: List<TbdexErrorDetail>,
)
