package ftl.kcc

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="IssueCredentialRequest",
  module="kcc",
)
public data class IssueCredentialRequest(
  public val format: String,
  public val proof: Proof,
)
