package ftl.kcc

import kotlin.String
import kotlin.collections.List
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="AssetRequest",
  module="kcc",
)
public data class AssetRequest(
  public val assetName: String,
  public val flowId: String,
  public val interviewId: String,
  public val orderId: String,
  public val externalId: String,
  public val onboardingStatus: String,
  public val transactionId: List<String>,
)
