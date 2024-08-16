package ftl.compliance

import kotlin.String
import xyz.block.ftl.GeneratedRef

@GeneratedRef(
  name="ApiCase",
  module="compliance",
)
public data class ApiCase(
  public val token: String,
  public val applicantDid: String,
  public val vendor: String,
  public val pfiUserId: String,
  public val applicationResult: ApplicationResult,
  public val applicationStatus: ApplicationStatus,
)
