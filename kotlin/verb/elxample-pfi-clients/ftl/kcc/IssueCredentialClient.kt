package ftl.kcc

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="issueCredential",
  module="kcc",
)
public interface IssueCredentialClient :
    VerbClient<HttpRequest<IssueCredentialRequest>, HttpResponse<IssueCredentialResponse, ApiError>>
    {
  public override fun call(`value`: HttpRequest<IssueCredentialRequest>):
      HttpResponse<IssueCredentialResponse, ApiError>
}
