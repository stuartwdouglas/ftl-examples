package ftl.compliance

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getCase",
  module="compliance",
)
public interface GetCaseClient : VerbClient<GetCaseRequest, GetCaseResponse> {
  public override fun call(`value`: GetCaseRequest): GetCaseResponse
}
