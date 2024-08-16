package ftl.compliance

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="createOnboardingCase",
  module="compliance",
)
public interface CreateOnboardingCaseClient : VerbClient<CreateCaseRequest, CreateCaseResponse> {
  public override fun call(`value`: CreateCaseRequest): CreateCaseResponse
}
