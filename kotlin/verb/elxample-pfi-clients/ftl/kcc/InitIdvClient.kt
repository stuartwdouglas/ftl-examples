package ftl.kcc

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="initIdv",
  module="kcc",
)
public interface InitIdvClient :
    VerbClient<HttpRequest<Siopv2AuthResponse>, HttpResponse<IdvRequest, ApiError>> {
  public override fun call(`value`: HttpRequest<Siopv2AuthResponse>):
      HttpResponse<IdvRequest, ApiError>
}
