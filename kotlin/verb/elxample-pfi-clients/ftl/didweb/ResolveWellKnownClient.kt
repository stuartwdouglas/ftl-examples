package ftl.didweb

import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.Any
import kotlin.ByteArray
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="resolveWellKnown",
  module="didweb",
)
public interface ResolveWellKnownClient :
    VerbClient<HttpRequest<in Any>, HttpResponse<ByteArray, in Any>> {
  public override fun call(`value`: HttpRequest<in Any>): HttpResponse<ByteArray, in Any>
}
