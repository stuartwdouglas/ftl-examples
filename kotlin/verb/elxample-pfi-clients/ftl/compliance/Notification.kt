package ftl.compliance

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="Notification",
  module="compliance",
)
public data class Notification(
  public val externalId: String,
  public val interviewId: String,
  public val onboardingStatus: String,
  public val flowId: String,
  public val clientId: String,
)
