package ftl.adminbff

import ftl.builtin.Empty
import ftl.builtin.HttpRequest
import ftl.builtin.HttpResponse
import kotlin.String
import xyz.block.ftl.VerbClient
import xyz.block.ftl.VerbClientDefinition

@VerbClientDefinition(
  name="ping",
  module="adminbff",
)
public interface PingClient : VerbClient<HttpRequest<Empty>, HttpResponse<Empty, String>> {
  public override fun call(`value`: HttpRequest<Empty>): HttpResponse<Empty, String>
}
