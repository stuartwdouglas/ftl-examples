package ftl.kcc

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="GenerateTokenRequest",
  module="kcc",
)
public data class GenerateTokenRequest(
  public val preAuthCode: String,
  public val grantType: String,
  public val clientId: String,
)
