package ftl.payments

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="SnsMessage",
  module="payments",
)
public data class SnsMessage(
  public val type: String,
  public val messageId: String,
  public val timestamp: String,
  public val signature: String,
  public val signatureVersion: String,
  public val signingCertUrl: String,
  public val message: String,
  public val topicArn: String,
  public val subject: String,
)
