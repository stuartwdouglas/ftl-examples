package ftl.compliance

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CreateCaseRequest",
  module="compliance",
)
public data class CreateCaseRequest(
  public val applicantDid: String,
  public val complianceTask: ComplianceTask,
  public val targetLevel: KycLevel,
)
