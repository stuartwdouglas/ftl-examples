package ftl.compliance

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="CreateCaseResponse",
  module="compliance",
)
public data class CreateCaseResponse(
  public val case_: ApiCase,
  public val applicantOnboardingUrl: String,
)
