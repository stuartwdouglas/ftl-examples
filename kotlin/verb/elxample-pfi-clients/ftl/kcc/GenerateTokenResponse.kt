package ftl.kcc

import kotlin.Boolean
import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="GenerateTokenResponse",
  module="kcc",
)
public data class GenerateTokenResponse(
  public val accessToken: String,
  public val tokenType: String,
  public val expiresIn: Boolean,
  public val cNonce: String,
  public val cNonceExpiresIn: Boolean,
)
