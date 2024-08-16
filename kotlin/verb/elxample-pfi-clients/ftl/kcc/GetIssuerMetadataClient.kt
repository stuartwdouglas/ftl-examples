package ftl.kcc

import ftl.builtin.Empty
import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="getIssuerMetadata",
  module="kcc",
)
public interface GetIssuerMetadataClient :
    VerbClient<HttpRequest<Empty>, HttpResponse<IssuerMetadata, ApiError>> {
  public override fun call(`value`: HttpRequest<Empty>): HttpResponse<IssuerMetadata, ApiError>
}
