package ftl.kcc

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import kotlin.ByteArray
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="createSiopv2AuthRequest",
  module="kcc",
)
public interface CreateSiopv2AuthRequestClient :
    VerbClient<HttpRequest<CreateSiopv2Request>, HttpResponse<ByteArray, ApiError>> {
  public override fun call(`value`: HttpRequest<CreateSiopv2Request>):
      HttpResponse<ByteArray, ApiError>
}
