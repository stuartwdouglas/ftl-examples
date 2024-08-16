package ftl.tbdex

import kotlin.String
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="TbdexError",
  module="tbdex",
)
public data class TbdexError(
  public val message: String,
  public val details: List<TbdexErrorDetail>,
)
