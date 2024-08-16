package ftl.kcc

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="deferredIssueCredential",
  module="kcc",
)
public interface DeferredIssueCredentialClient :
    VerbClient<HttpRequest<DeferredIssueCredentialRequest>, HttpResponse<DeferredIssueCredentialResponse, ApiError>>
    {
  public override fun call(`value`: HttpRequest<DeferredIssueCredentialRequest>):
      HttpResponse<DeferredIssueCredentialResponse, ApiError>
}
