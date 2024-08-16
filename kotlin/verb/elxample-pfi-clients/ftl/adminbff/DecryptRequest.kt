package ftl.adminbff

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="DecryptRequest",
  module="adminbff",
)
public data class DecryptRequest(
  public val ciphertext: String,
  public val aad: String,
)
