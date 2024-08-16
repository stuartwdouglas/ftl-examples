package ftl.adminbff

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="EncryptRequest",
  module="adminbff",
)
public data class EncryptRequest(
  public val plaintext: String,
  public val aad: String,
)
