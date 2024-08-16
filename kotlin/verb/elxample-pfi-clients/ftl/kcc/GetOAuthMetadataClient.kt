package ftl.kcc

import ftl.builtin.Empty
import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getOAuthMetadata",
  module="kcc",
)
public interface GetOAuthMetadataClient :
    VerbClient<HttpRequest<Empty>, HttpResponse<AuthorizationMetadata, ApiError>> {
  public override fun call(`value`: HttpRequest<Empty>):
      HttpResponse<AuthorizationMetadata, ApiError>
}
