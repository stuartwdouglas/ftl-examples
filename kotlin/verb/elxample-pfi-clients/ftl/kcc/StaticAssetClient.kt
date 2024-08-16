package ftl.kcc

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import ftl.types.ApiError
import kotlin.ByteArray
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="staticAsset",
  module="kcc",
)
public interface StaticAssetClient :
    VerbClient<HttpRequest<AssetRequest>, HttpResponse<ByteArray, ApiError>> {
  public override fun call(`value`: HttpRequest<AssetRequest>): HttpResponse<ByteArray, ApiError>
}
