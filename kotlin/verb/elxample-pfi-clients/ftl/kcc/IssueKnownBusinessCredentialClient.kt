package ftl.kcc

import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="issueKnownBusinessCredential",
  module="kcc",
)
public interface IssueKnownBusinessCredentialClient : VerbClient<IssueKbcRequest, IssueKbcResponse>
    {
  public override fun call(`value`: IssueKbcRequest): IssueKbcResponse
}
